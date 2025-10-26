package racingcar;

import java.util.List;
import racingcar.domain.Cars;
import racingcar.domain.Name;
import racingcar.domain.TryCount;
import racingcar.utils.InputParser;
import racingcar.utils.RandomNumberGenerator;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class RacingController {
    private final InputView inputView;

    public RacingController(InputView inputView) {
        this.inputView = inputView;
    }

    public void run() {
        List<Name> names = carNamesFromInput();
        TryCount tryCount = tryCountFromInput();

        Cars cars = Cars.createCarList(names);

        playGame(cars, tryCount);

        OutputView.printWinners(cars);
    }

    private void playGame(Cars cars, TryCount tryCount) {
        for(int i = 0; i < tryCount.getCount(); i++) {
            cars.moveAllCars();
            OutputView.printCarStatus(cars);
        }
    }

    private List<Name> carNamesFromInput() {
        String input = inputView.inputCarNames();
        return InputParser.inputParseDelimiter(input);
    }

    private TryCount tryCountFromInput() {
        int count = inputView.inputTryCount();
        return new TryCount(count);
    }
}
