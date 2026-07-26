package defpackage;

import android.view.View;
import android.view.ViewGroup;
import ir.mservices.market.social.welcome.recycler.WelcomeBirthdayData;
import ir.mservices.market.social.welcome.recycler.WelcomeGenderData;
import ir.mservices.market.social.welcome.recycler.WelcomeImageData;
import ir.mservices.market.social.welcome.recycler.WelcomeNameData;
import ir.mservices.market.social.welcome.recycler.b;
import ir.mservices.market.social.welcome.recycler.c;
import ir.mservices.market.version2.ui.recycler.adapter.a;

/* JADX INFO: loaded from: classes3.dex */
public final class pd9 extends a {
    public rd9 l;
    public rd9 m;
    public rd9 n;
    public rd9 o;
    public rd9 p;

    @Override // ir.mservices.market.version2.ui.recycler.adapter.a
    public final qg5 I(int i, View view, ViewGroup viewGroup) {
        if (i == WelcomeNameData.c) {
            rd9 rd9Var = this.l;
            if (rd9Var == null) {
                js3.V("onNameChangedListener");
                throw null;
            }
            rd9 rd9Var2 = this.o;
            if (rd9Var2 != null) {
                return new c(view, rd9Var, rd9Var2);
            }
            js3.V("onActionDoneListener");
            throw null;
        }
        if (i == WelcomeImageData.d) {
            rd9 rd9Var3 = this.p;
            if (rd9Var3 != null) {
                return new b(view, rd9Var3);
            }
            js3.V("imageOnClickListener");
            throw null;
        }
        if (i == WelcomeBirthdayData.b) {
            rd9 rd9Var4 = this.m;
            if (rd9Var4 != null) {
                return new qd9(view, rd9Var4);
            }
            js3.V("onDateChangedListener");
            throw null;
        }
        if (i != WelcomeGenderData.b) {
            return null;
        }
        rd9 rd9Var5 = this.n;
        if (rd9Var5 != null) {
            return new ir.mservices.market.social.welcome.recycler.a(view, rd9Var5);
        }
        js3.V("onGenderChangedListener");
        throw null;
    }
}
