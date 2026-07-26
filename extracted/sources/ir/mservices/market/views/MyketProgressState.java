package ir.mservices.market.views;

import defpackage.r22;
import defpackage.sl3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class MyketProgressState {
    public static final sl3 a;
    public static final MyketProgressState b;
    public static final MyketProgressState c;
    public static final MyketProgressState d;
    public static final /* synthetic */ MyketProgressState[] e;
    public static final /* synthetic */ r22 f;

    static {
        MyketProgressState myketProgressState = new MyketProgressState("BUTTON", 0);
        b = myketProgressState;
        MyketProgressState myketProgressState2 = new MyketProgressState("LOADING", 1);
        c = myketProgressState2;
        MyketProgressState myketProgressState3 = new MyketProgressState("ANIMATION", 2);
        d = myketProgressState3;
        MyketProgressState[] myketProgressStateArr = {myketProgressState, myketProgressState2, myketProgressState3};
        e = myketProgressStateArr;
        f = kotlin.enums.a.a(myketProgressStateArr);
        a = new sl3(9);
    }

    public static MyketProgressState valueOf(String str) {
        return (MyketProgressState) Enum.valueOf(MyketProgressState.class, str);
    }

    public static MyketProgressState[] values() {
        return (MyketProgressState[]) e.clone();
    }
}
