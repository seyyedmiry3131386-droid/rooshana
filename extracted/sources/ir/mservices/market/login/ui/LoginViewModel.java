package ir.mservices.market.login.ui;

import android.os.Parcelable;
import defpackage.fm8;
import defpackage.ja1;
import defpackage.jd7;
import defpackage.js3;
import defpackage.rv6;
import defpackage.vz7;
import defpackage.wd4;
import defpackage.zd4;
import ir.mservices.market.login.data.LoginData;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.viewModel.c;
import java.io.Serializable;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class LoginViewModel extends c {
    public final zd4 t;
    public final fm8 u;
    public final vz7 v;
    public final wd4 w;
    public final l x;
    public final rv6 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginViewModel(jd7 jd7Var, zd4 zd4Var, fm8 fm8Var, vz7 vz7Var) {
        super(false);
        js3.p(jd7Var, "savedStateHandle");
        js3.p(zd4Var, "loginRepository");
        js3.p(fm8Var, "timerRepository");
        js3.p(vz7Var, "smsUtils");
        this.t = zd4Var;
        this.u = fm8Var;
        this.v = vz7Var;
        if (!jd7Var.a("data")) {
            throw new IllegalArgumentException("Required argument \"data\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(DialogDataModel.class) && !Serializable.class.isAssignableFrom(DialogDataModel.class)) {
            throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        DialogDataModel dialogDataModel = (DialogDataModel) jd7Var.b("data");
        if (dialogDataModel == null) {
            throw new IllegalArgumentException("Argument \"data\" is marked as non-null but was passed a null value");
        }
        if (!jd7Var.a("loginData")) {
            throw new IllegalArgumentException("Required argument \"loginData\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(LoginData.class) && !Serializable.class.isAssignableFrom(LoginData.class)) {
            throw new UnsupportedOperationException(LoginData.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        LoginData loginData = (LoginData) jd7Var.b("loginData");
        if (loginData == null) {
            throw new IllegalArgumentException("Argument \"loginData\" is marked as non-null but was passed a null value");
        }
        this.w = new wd4(dialogDataModel, loginData);
        l lVarB = ja1.b(null);
        this.x = lVarB;
        this.y = new rv6(lVarB);
    }
}
