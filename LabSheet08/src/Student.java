public class Student {
    private String name;
    private int study_year;
    private int score = 0;

    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
    void setStudyYear(int study_year){
        this.study_year = study_year;
    }
    int getStudy_year(){
        return this.study_year;
    }
    int getScore(){
        return this.score;
    }
    void addPoint(int point){
        this.score += point;
        System.out.println(name + " got " + point + " points");
    }
    String getGrade(){
        if (score >= 80) return "A";
        else if (score >= 70) return "B";
        else if (score >= 60) return "C";
        return "F";
    }
}
