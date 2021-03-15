package com.tts.saveoursons.model;

@Entity
public class CrimeCase {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String color;
    private String name;
}

