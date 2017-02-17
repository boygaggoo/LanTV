package uk.co.sentinelweb.tvmod.browse;

import uk.co.sentinelweb.tvmod.mvp.BaseMvpContract;

public interface MainMvpContract  {
    interface Presenter extends BaseMvpContract.Presenter<View>{

    }

    interface View extends BaseMvpContract.View<Presenter> {

        void setData(MainFragmentModel model);

        void updateBackGround();

    }

}