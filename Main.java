import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main extends Application{
    @Override
    public void start(Stage stage) {
        TextField txtNum1 = new TextField();
        TextField txtNum2 = new TextField();
        TextField lblResultado = new TextField("Resultado");
        Button btnSumar = new Button("Sumar");
        btnSumar.setOnAction(e->{
            double num1 = Double.parseDouble(txtNum1.getText());
            double num2 = Double.parseDouble(txtNum2.getText());
            double resultado = num1 + num2;
            lblResultado.setText("El resultado es: "+ resultado);
        });

        Button btnRestar = new Button("Resta");
        btnRestar.setOnAction(e->{
            double num1 = Double.parseDouble(txtNum1.getText());
            double num2 = Double.parseDouble(txtNum2.getText());
            double resultado = num1 - num2;
            lblResultado.setText("El resultado es: "+ resultado);
        });

        Button btnDividir = new Button("Dividir");
        btnDividir.setOnAction(e->{
            double num1 = Double.parseDouble(txtNum1.getText());
            double num2 = Double.parseDouble(txtNum2.getText());
            if (num1!=0  && num2!=0){
                double resultado = num1 / num2;
                lblResultado.setText("El resultado es: "+ resultado);
            }else{
            lblResultado.setText("Valor Invalido");
            }
        });

        Button btnMultiplicar = new Button("Multiplicar");
        btnMultiplicar.setOnAction(e->{
            double num1 = Double.parseDouble(txtNum1.getText());
            double num2 = Double.parseDouble(txtNum2.getText());
            double resultado = num1 * num2;
            lblResultado.setText("El resultado es: "+ resultado);
        });

        VBox panel = new VBox(10,txtNum1,txtNum2,lblResultado,btnSumar,btnMultiplicar,btnDividir,btnRestar);
        Scene scene = new Scene (panel,500,400);
        stage.setTitle("Calculadora");
        stage.setScene(scene);
        stage.show();
    }public static void main(String[] args) {
        launch(args);
    }
}