/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jd522_fa2;

/**
 *
 * @author Caitlin
 */
public class Task<T> {
    private T taskName;
    private T description;
    private T status;
    private T category;

    public Task(T taskName, T description, T status, T category) {
        this.taskName = taskName;
        this.description = description;
        this.status = status;
        this.category = category;
    }

    public T getTaskName() {
        return taskName;
    }

    public T getDescription() {
        return description;
    }

    public T getStatus() {
        return status;
    }

    public T getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return taskName + "," + description + "," + status + "," + category;
    }
}


