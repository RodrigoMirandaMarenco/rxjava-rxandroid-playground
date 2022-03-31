package com.rmiranda.rxplayground.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rodrigomiranda on 30/3/22.
 */
public class Task {

   private String description;
   private boolean isComplete;
   private int priority;

   public Task(String description, boolean isComplete, int priority) {
      this.description = description;
      this.isComplete = isComplete;
      this.priority = priority;
   }

   public static List<Task> createTaskList() {
      List<Task> list = new ArrayList<>();
      list.add(new Task("Task 1", true, 3));
      list.add(new Task("Task 2", false, 2));
      list.add(new Task("Task 3", true, 1));
      list.add(new Task("Task 4", false, 0));
      list.add(new Task("Task 5", true, 5));
      return list;
   }

   public String getDescription() {
      return description;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public boolean isComplete() {
      return isComplete;
   }

   public void setComplete(boolean complete) {
      isComplete = complete;
   }

   public int getPriority() {
      return priority;
   }

   public void setPriority(int priority) {
      this.priority = priority;
   }
}
