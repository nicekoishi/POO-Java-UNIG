package calculadora;

public class operations {
    public float a;
    public float b;
    public float result;
    public String operation;

    public void setNum(float a, float b, String operation){
        this.a = a;
        this.b = b;
        this.operation = operation;
    }

    public void setSoma(float a, float b){
        result = (a + b);
    }

    public void setSubt(float a, float b){
        result = (a - b);
    }

    public void setMulti(float a, float b){
        result = (a * b);
    }

    public void setDivision(float a, float b){
        result = (a / b);
    }
}
