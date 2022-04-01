/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alfar
 */
public class Grade {

    private int points;
    private int grade;

    public Grade(Integer points) {
        this.points = points;
        
        if (points >= 90) {
            this.grade = 5;
        } else if (points >= 80) {
            this.grade = 4;
        } else if (points >= 70) {
            this.grade = 3;
        } else if (points >= 60) {
            this.grade = 2;
        } else if (points >= 50) {
            this.grade = 1;
        }else{
            this.grade= 0;
        }

    }
    public int getPoints(){
        return this.points;
    }
    public int getGrade(){
        return this.grade;
    }
}
