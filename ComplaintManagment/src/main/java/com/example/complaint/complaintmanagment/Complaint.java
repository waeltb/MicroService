package com.example.complaint.complaintmanagment;


import com.example.complaint.complaintmanagment.Enum.Categorie;
import com.example.complaint.complaintmanagment.Enum.Status;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level=AccessLevel.PRIVATE)
@Entity
public class Complaint {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idComplaint;
    //@Size(min=3, message="Title must contain at least 3 characters")
    String title;
    @Enumerated(EnumType.STRING)
    Categorie categorie;
    @Temporal(TemporalType.DATE)
    Date created_at;
    //@Size(min= 10,message="Description must contain at least 10 characters")
    //@Size(max= 100,message="Description must contain a maximum of 100 characters")
    //@NotEmpty(message = "Please provide a description !")
    String description;
    @Enumerated(EnumType.STRING)
    Status status;
    //@ManyToOne()
    //@JsonIgnore
    //User user;

    public Complaint(String title, String description) {
    }
}
