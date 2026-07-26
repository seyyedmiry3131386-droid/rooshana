package ir.mservices.market.login.ui;

import android.os.Parcelable;
import defpackage.bt2;
import defpackage.f88;
import defpackage.fm8;
import defpackage.j99;
import defpackage.ja1;
import defpackage.jd7;
import defpackage.js3;
import defpackage.k79;
import defpackage.rv6;
import defpackage.t32;
import defpackage.u86;
import defpackage.uz7;
import defpackage.v86;
import defpackage.x86;
import defpackage.y97;
import defpackage.z86;
import ir.mservices.market.core.analytics.ClickEventBuilder;
import ir.mservices.market.login.data.BindData;
import ir.mservices.market.login.data.LoginData;
import ir.mservices.market.login.data.PinBindData;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import java.io.Serializable;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class PinViewModel extends k79 {
    public final x86 b;
    public final fm8 c;
    public final l d;
    public final rv6 e;
    public final l f;
    public final rv6 g;
    public final v86 h;
    public final l i;
    public final rv6 j;
    public final l k;
    public final rv6 l;
    public final l m;
    public final rv6 n;
    public final l o;
    public final rv6 p;
    public final l q;
    public final rv6 r;
    public final l s;
    public final rv6 t;
    public final l u;
    public final rv6 v;
    public z86 w;
    public int x;

    public PinViewModel(jd7 jd7Var, x86 x86Var, fm8 fm8Var) {
        js3.p(jd7Var, "savedStateHandle");
        js3.p(x86Var, "pinRepository");
        js3.p(fm8Var, "timerRepository");
        this.b = x86Var;
        this.c = fm8Var;
        l lVarB = ja1.b("");
        this.d = lVarB;
        this.e = new rv6(lVarB);
        l lVarB2 = ja1.b("");
        this.f = lVarB2;
        this.g = new rv6(lVarB2);
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
        if (!jd7Var.a("backLoginData")) {
            throw new IllegalArgumentException("Required argument \"backLoginData\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(LoginData.class) && !Serializable.class.isAssignableFrom(LoginData.class)) {
            throw new UnsupportedOperationException(LoginData.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        LoginData loginData2 = (LoginData) jd7Var.b("backLoginData");
        if (loginData2 == null) {
            throw new IllegalArgumentException("Argument \"backLoginData\" is marked as non-null but was passed a null value");
        }
        this.h = new v86(dialogDataModel, loginData, loginData2);
        Boolean bool = Boolean.FALSE;
        l lVarB3 = ja1.b(bool);
        this.i = lVarB3;
        this.j = new rv6(lVarB3);
        l lVarB4 = ja1.b(new j99(null));
        this.k = lVarB4;
        this.l = new rv6(lVarB4);
        l lVarB5 = ja1.b(new j99(null));
        this.m = lVarB5;
        this.n = new rv6(lVarB5);
        l lVarB6 = ja1.b(bool);
        this.o = lVarB6;
        this.p = new rv6(lVarB6);
        l lVarB7 = ja1.b("");
        this.q = lVarB7;
        this.r = new rv6(lVarB7);
        l lVarB8 = ja1.b(bool);
        this.s = lVarB8;
        this.t = new rv6(lVarB8);
        l lVarB9 = ja1.b(null);
        this.u = lVarB9;
        this.v = new rv6(lVarB9);
        t32.b().l(this, false);
        BindData bindData = loginData.a;
        js3.n(bindData, "null cannot be cast to non-null type ir.mservices.market.login.data.PinBindData");
        PinBindData pinBindData = (PinBindData) bindData;
        String str = pinBindData.h;
        lVarB.p(null, str != null ? str : "");
        lVarB6.p(null, Boolean.valueOf(pinBindData.g));
        int i = fm8Var.c;
        Integer numValueOf = i <= 0 ? null : Integer.valueOf(i);
        pinBindData.c = numValueOf != null ? numValueOf.intValue() : pinBindData.c;
        int iCurrentTimeMillis = fm8Var.b - ((int) ((System.currentTimeMillis() - fm8Var.a) / ((long) 1000)));
        Integer numValueOf2 = iCurrentTimeMillis <= 0 ? null : Integer.valueOf(iCurrentTimeMillis);
        this.x = numValueOf2 != null ? numValueOf2.intValue() : pinBindData.d;
        lVarB9.p(null, pinBindData);
        fm8Var.b = this.x;
        fm8Var.a = System.currentTimeMillis();
        z86 z86Var = new z86(this, ((long) this.x) * 1000);
        this.w = z86Var;
        z86Var.start();
    }

    @Override // defpackage.k79
    public final void d() {
        z86 z86Var = this.w;
        if (z86Var != null) {
            z86Var.cancel();
        }
        t32.b().o(this);
    }

    public final void e(String str, String str2) {
        js3.p(str2, "verificationText");
        v86 v86Var = this.h;
        LoginData loginData = v86Var.b;
        LoginData loginData2 = v86Var.b;
        if (loginData.a instanceof PinBindData) {
            l lVar = this.i;
            if (((Boolean) lVar.getValue()).booleanValue()) {
                return;
            }
            Boolean bool = Boolean.TRUE;
            lVar.getClass();
            lVar.p(null, bool);
            ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
            clickEventBuilder.b("login_pin_" + loginData2.c);
            clickEventBuilder.a();
            BindData bindData = loginData2.a;
            js3.n(bindData, "null cannot be cast to non-null type ir.mservices.market.login.data.PinBindData");
            PinBindData pinBindData = (PinBindData) bindData;
            pinBindData.h = str;
            bt2.G(y97.G(this), null, null, new PinViewModel$verify$1(this, pinBindData, str, str2, null), 3);
        }
    }

    public final void onEvent(u86 u86Var) {
        js3.p(u86Var, "event");
        String str = u86Var.a;
        l lVar = this.d;
        lVar.getClass();
        lVar.p(null, str);
    }

    public final void onEvent(uz7 uz7Var) {
        js3.p(uz7Var, "event");
        String str = uz7Var.a;
        if (str != null && !f88.n0(str) && !((Boolean) this.j.a.getValue()).booleanValue()) {
            e("", str);
        }
        js3.o(str, "getMessage(...)");
        l lVar = this.f;
        lVar.getClass();
        lVar.p(null, str);
    }
}
