
import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.geometry.Insets;

public class BuscarReemplazarMain extends Application {
	
	private Label buscar;
	private Label reemplazar;
	
	private TextField texto1;
	private TextField texto2;
	
	private Button boton1;
	private Button boton2;
	private Button boton3;
	private Button boton4;
	private Button boton5;
	
	private CheckBox checkBox1;
	private CheckBox checkBox2;
	private CheckBox checkBox3;
	private CheckBox checkBox4;
	

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		buscar = new Label("Buscar:");
		reemplazar = new Label("Reemplazar con:");

		texto1 = new TextField();

		texto2 = new TextField();
		
		checkBox1 = new CheckBox("May�sculas y min�sculas");
		checkBox2 = new CheckBox("Buscar hacia atr�s");		
		checkBox3 = new CheckBox("Expresi�n regular");
		checkBox4 = new CheckBox("Resaltar resultados");
		
		boton1 = new Button("Buscar");
		boton1.setPrefWidth(150);
		boton2 = new Button("Reemplazar");
		boton2.setPrefWidth(150);
		boton3 = new Button("Reemplazar todo");
		boton3.setPrefWidth(150);
		boton4 = new Button("Cerrar");
		boton4.setPrefWidth(150);
		boton5 = new Button("Ayuda");
		boton5.setPrefWidth(150);
		
		GridPane root = new GridPane();
		root.setPadding(new Insets (5));
		root.setHgap(5);
		root.setVgap(5);
		root.addRow(0, new Label("Buscar:"), texto1);
		root.addRow(1, new Label("Reemplazar con:"), texto2);
		root.add(new HBox(5, checkBox1, checkBox2), 1, 2);
		root.add(new HBox(5, checkBox3, checkBox4), 1, 3);
		root.addColumn(2, boton1);
		root.add(boton2, 2, 1);
		root.add(boton3, 2, 2);
		root.add(boton4, 2, 3);
		root.add(boton5, 2, 4);
		
		ColumnConstraints [] cols = {
				new ColumnConstraints(),	
				new ColumnConstraints(),	
				new ColumnConstraints(),	
			};
			root.getColumnConstraints().setAll(cols);
			
		cols[1].setHgrow(Priority.ALWAYS);
		cols[1].setFillWidth(true);
		
		Scene scene = new Scene(root, 500, 300);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Buscar y reemplazar");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}