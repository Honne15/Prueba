package com.appspc.apilibros.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

import java.util.*;

@Entity
@Table(name="users")
@Data
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="user_id")
    private Long id;

    @Column(name = "username", length = 20)
    private String username;

    @Column(name = "lastname", length = 20)
    private String lastname;

    @Column(name = "doc_type")
    private String doc_type;

    @Column(name = "doc")
    private Integer doc;

    @Column(name = "email")
    private String email;

    @Column(name = "tel")
    private Integer tel;

    @Column(name = "birth")
    private Date birth;

    @Column(name = "imagen")
    @OneToOne(cascade = {CascadeType.ALL})
    private String imagen;

    @Column(name = "bio")
    private String bio;

    @Enumerated(EnumType.STRING)
    @Column(name = "role")    
    private Rol role;

    @OneToMany(cascade = {CascadeType.ALL})
    @JoinTable(name = "reading", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "book_id"))
    private Set<Books> reading;

}
