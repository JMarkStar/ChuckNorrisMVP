package com.jmarkstar.core.presenter.jokes;

import com.jmarkstar.core.presenter.BaseContractor;
import com.jmarkstar.core.domain.model.JokeModel;
import java.util.ArrayList;

/**
 * Created by jmarkstar on 1/06/2017.
 */

public interface JokeContract {

    interface JokeView extends BaseContractor.BaseView {
        void showJokes(ArrayList<JokeModel> jokes);
        void getNumberOfJokes(Integer numberOfJokes);
    }

    interface JokePresenter {
        void onGetRandomJokes(Integer count);
        void onGetRandomJokesWithCustomName(Integer count, String name, String lastName);
        void onGetSpecificJoke(Integer idJoke);
        void onGetNumberOfJokes();
    }
}
