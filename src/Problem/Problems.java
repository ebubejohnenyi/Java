package Problem;

public class Problems {
    private String name;
    private TypeOfProblem type;
    public Problems(String name, TypeOfProblem type){
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TypeOfProblem getType() {
        return type;
    }

    public void setType(TypeOfProblem type) {
        this.type = type;
    }
}
