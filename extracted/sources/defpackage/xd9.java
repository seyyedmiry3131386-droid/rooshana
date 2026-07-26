package defpackage;

import ir.mservices.market.social.welcome.recycler.WelcomeBirthdayData;
import ir.mservices.market.social.welcome.recycler.WelcomeGenderData;
import ir.mservices.market.social.welcome.recycler.WelcomeImageData;
import ir.mservices.market.social.welcome.recycler.WelcomeNameData;

/* JADX INFO: loaded from: classes3.dex */
public final class xd9 extends c16 {
    public final v48 c;
    public final v48 d;
    public final v48 e;
    public final v48 f;
    public final v48 g;
    public final fu7 h;
    public final v48 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xd9(v48 v48Var, v48 v48Var2, v48 v48Var3, v48 v48Var4, v48 v48Var5, fu7 fu7Var, v48 v48Var6) {
        super(1);
        js3.p(v48Var, "nameFlow");
        js3.p(v48Var2, "currentAvatarFlow");
        js3.p(v48Var3, "uploadAvatarPathFlow");
        js3.p(v48Var4, "birthdayFlow");
        js3.p(v48Var5, "genderFlow");
        js3.p(fu7Var, "avatarProgressStateFlow");
        js3.p(v48Var6, "nameErrorFlow");
        this.c = v48Var;
        this.d = v48Var2;
        this.e = v48Var3;
        this.f = v48Var4;
        this.g = v48Var5;
        this.h = fu7Var;
        this.i = v48Var6;
    }

    @Override // defpackage.c16
    public final Object d() {
        return br9.C(new WelcomeNameData(this.c, this.i), new WelcomeImageData(this.d, this.e, this.h), new WelcomeBirthdayData(this.f), new WelcomeGenderData(this.g));
    }
}
