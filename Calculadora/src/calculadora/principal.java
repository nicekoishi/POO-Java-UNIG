package calculadora;

public class principal {
    public static void main(String[] args) {

        operations op = new operations();

            op.setNum(365,92,"/");

            if (op.a == 0){
                System.out.println("Operação não é possível.");
            } else {
                if (op.b == 0){
                    System.out.println("Operação não é possível.");
                } else {
                    switch (op.operation) {
                        case "+": op.operation = "+";
                            op.setSoma(op.a, op.b);
                        case "-": op.operation = "-";
                            op.setSubt(op.a, op.b);
                        case "*": op.operation = "*";
                            op.setMulti(op.a, op.b);
                        case "/": op.operation = "/";
                            op.setDivision(op.a, op.b);
                        default: op.operation = "Operador inválido";
                            System.out.println("Operador inválido");

                    }

                    if (op.result != 0){
                        System.out.println(op.result);
                    }
                }
            }
        }
    }
