package com.company.admissioncommittee.app;

import com.company.admissioncommittee.entity.*;
import com.company.admissioncommittee.screen.branch.BranchEdit;
import io.jmix.core.DataManager;
import io.jmix.core.Sort;
import io.jmix.core.entity.KeyValueEntity;
import io.jmix.core.security.Authenticated;
import io.jmix.core.security.CurrentAuthentication;
import io.jmix.core.security.SystemAuthenticator;
import io.jmix.ui.component.Table;
import io.jmix.ui.component.Window;
import io.jmix.ui.screen.MessageBundle;
import io.jmix.ui.screen.Screen;
import org.postgresql.util.PSQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.Year;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.UUID;

@Service
public class BranchService {

    @Autowired
    private DataManager dataManager;
    @Autowired
    private SystemAuthenticator systemAuthenticator;
    @Autowired
    private CurrentAuthentication currentAuthentication;

    @Authenticated
    @ManagedOperation
    @Scheduled(fixedRate = 30000)
    public void autoUpdateRating(){
        systemAuthenticator.withSystem(() -> {
            currentAuthentication.getUser();
            return "Done";
        });
        List<Student> students = dataManager.load(Student.class).query("select s "+
                        "from Student s")
                .list();
        for (Student stud:
             students) {
            ArrayList<Branch> branches = new ArrayList<>();
            stud.getPrefered().forEach(preferedBranch -> {branches.add(preferedBranch.getBranch());});
            List<Rating> ratings = dataManager.load(Rating.class).query("select r "+
                            "from Rating r where r.branch in ?1 and r.admissionCampaign.year=?2",branches,Calendar.getInstance().get(Calendar.YEAR))
                    .list();
            for (Branch branch:
                    branches) {
                for (Rating rat:
                        ratings) {
                    if (rat.getBranch().equals(branch)) {
                        rat.getStudents().size();
                        List<Student> temp;
                        temp = rat.getStudents();
                        temp.add(stud);
                        rat.setStudents(temp);
                        try {
                            dataManager.save(rat);
                        } catch (Exception ex) {
                            System.out.println(ex.getStackTrace());

                        }
                    }
                }
            }
        }
    }

    public void fillStudentInRating(){
        Student stud = dataManager.load(Student.class).query("select s "+
                        "from Student s")
                .sort(Sort.by(Sort.Direction.DESC,"lastModifiedDate"))
                .one();
        ArrayList<Branch> branches = new ArrayList<>();
        stud.getPrefered().forEach(preferedBranch -> {branches.add(preferedBranch.getBranch());});
        List<Rating> ratings = dataManager.load(Rating.class).query("select r "+
                        "from Rating r where r.branch in ?1 and r.admissionCampaign.year=?2",branches,Calendar.getInstance().get(Calendar.YEAR))
                .list();
        for (Branch branch:
                branches) {
            for (Rating rat:
                    ratings) {
                if (rat.getBranch().equals(branch)) {
                    rat.getStudents().size();
                    List<Student> temp;
                    temp = rat.getStudents();
                    temp.add(stud);
                    rat.setStudents(temp);
                    try {
                        dataManager.save(rat);
                    }catch (Exception ex){System.out.println(ex.getStackTrace());

                    }

                }
            }
        }
    }

    public void fillBranchInRating(){
        Branch branch = dataManager.load(Branch.class).query("select b "+
                        "from Branch b")
                .sort(Sort.by(Sort.Direction.DESC,"lastModifiedDate"))
                .one();
        Rating rating = new Rating();
        rating.setBranch(branch);
        rating.setId(UUID.randomUUID());
        try{
            dataManager.save(rating);
        }catch (Exception ex){
            System.out.println(ex.getStackTrace());
        }
    }
}