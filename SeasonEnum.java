import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.*;

import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * Created by William Yu on 3/27/2017.
 */
public class SeasonEnum extends Application {
    public enum Month {January, February, March, April, May, June, July, August, September, October, November, December}

    public void start(Stage primaryStage) {
        Month monthSelection[] = {Month.January, Month.February, Month.March, Month.April, Month.May, Month.June,
                Month.July, Month.August, Month.September, Month.October, Month.November, Month.December};
        ObservableList<Month> options = FXCollections.observableArrayList(monthSelection);
        ComboBox monthCombo = new ComboBox(options);
        GridPane monthpane = new GridPane();
        Scene monthscene = new Scene(monthpane);
        primaryStage.setTitle("Month of the Year");
        primaryStage.setWidth(500);
        Label monthLabel = new Label("Greeting!");

        monthCombo.setOnAction(e ->
        {
            switch (monthCombo.getValue().toString()) {
                case "December":
                case "January":
                case "February":
                    monthLabel.setText("Do you want to build a snow man?");
                    break;
                case "March":
                case "April":
                case "May":
                    monthLabel.setText("Happy Spring Days!");
                    break;
                case "June":
                case "July":
                case "August":
                    monthLabel.setText("It's a summer time.");
                    break;
                case "September":
                case "October":
                case "November":
                    monthLabel.setText("Welcome to the foliage season!");
                    break;
                default:
                    monthLabel.setText("Enter a month");
                    break;
            }
        });
        Button exitButton = new Button("Exit");
        exitButton.setOnAction(e->System.exit(0));
        monthpane.add(monthLabel, 0, 0, 2, 1);
        monthpane.add(monthCombo, 0, 1, 1, 1);
        monthpane.add(exitButton, 0, 2,2,2);

        primaryStage.setScene(monthscene);
        primaryStage.show();

    }


}
