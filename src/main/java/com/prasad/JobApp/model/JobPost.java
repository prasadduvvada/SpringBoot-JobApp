package com.prasad.JobApp.model;

<<<<<<< HEAD
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
=======
>>>>>>> d76abb4c1621d31242ee37f5ce8997ab794e9ed8
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
<<<<<<< HEAD
@Entity
public class JobPost {
    @Id
=======
public class JobPost {
>>>>>>> d76abb4c1621d31242ee37f5ce8997ab794e9ed8
    private int postId;
    private String PostProfile;
    private String PostDesc;
    private int ReqExperience;
    private List<String> PostTechStack;
}
