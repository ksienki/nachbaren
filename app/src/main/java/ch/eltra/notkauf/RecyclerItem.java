package ch.eltra.notkauf;

class RecyclerItem {
    private String mText1;
    private String mText2;
    private String mText3;
    private Boolean mFood;
    private Boolean mDrugs;
    private Boolean mCar;
    private Boolean mOther;
    private int mPeople;

    RecyclerItem(String text1, String text2, String text3, Boolean food, Boolean drugs, Boolean car, Boolean other, int people) {
        mText1 = text1;
        mText2 = text2;
        mText3 = text3;
        mFood = food;
        mDrugs = drugs;
        mCar = car;
        mOther = other;
        mPeople = people;
    }

    String getText1() {
        return mText1;
    }

    String getText2() {
        return mText2;
    }

    String getText3() { return mText3; }

    Boolean getFood() { return mFood; }

    Boolean getDrugs() { return mDrugs; }

    Boolean getCar() { return mCar; }

    Boolean getOther() { return mOther; }

    int getPeople() { return mPeople; }
}
