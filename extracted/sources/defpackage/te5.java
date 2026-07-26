package defpackage;

import android.content.Context;
import ir.mservices.market.app.packages.ui.PackageViewModel;
import ir.mservices.market.myAccount.dialog.nickname.NicknameDialogViewModel;
import ir.mservices.market.pika.common.model.NearbyRepository;
import ir.mservices.market.pika.connect.PikaConnectViewModel;
import ir.mservices.market.social.mynet.MynetViewModel;
import ir.mservices.market.social.profile.own.OwnProfileHeaderViewModel;
import ir.mservices.market.social.profile.own.OwnProfileViewModel;
import ir.mservices.market.social.search.MynetSearchViewModel;
import ir.mservices.market.social.users.followers.OtherAccountFollowersViewModel;
import ir.mservices.market.social.users.following.OtherAccountFollowingViewModel;
import ir.mservices.market.version2.manager.install.a;
import ir.mservices.market.version2.services.e;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class te5 implements on6 {
    public static x57 a(Context context) {
        x57 x57Var = new x57();
        x57Var.c = new LinkedList();
        x57Var.d = false;
        x57Var.a = x57.b(5242880, context, "volley");
        x57Var.b = x57.b(20971520, context, "volley_i");
        x57Var.d = true;
        return x57Var;
    }

    public static mr7 b(t32 t32Var) {
        mr7 mr7Var = new mr7();
        t32Var.l(mr7Var, false);
        return mr7Var;
    }

    public static PackageViewModel c(hl5 hl5Var, a aVar, yl5 yl5Var, jd7 jd7Var) {
        return new PackageViewModel(hl5Var, aVar, yl5Var, jd7Var);
    }

    public static ir.mservices.market.core.notification.a d(Context context, t32 t32Var, ps1 ps1Var, a aVar) {
        return new ir.mservices.market.core.notification.a(context, t32Var, ps1Var, aVar);
    }

    public static NicknameDialogViewModel e(f5 f5Var, c5 c5Var) {
        return new NicknameDialogViewModel(f5Var, c5Var);
    }

    public static PikaConnectViewModel f(jd7 jd7Var, NearbyRepository nearbyRepository) {
        return new PikaConnectViewModel(jd7Var, nearbyRepository);
    }

    public static MynetViewModel g(xg5 xg5Var, t19 t19Var) {
        return new MynetViewModel(xg5Var, t19Var);
    }

    public static OwnProfileHeaderViewModel h(vo4 vo4Var, cw5 cw5Var, c5 c5Var) {
        return new OwnProfileHeaderViewModel(vo4Var, cw5Var, c5Var);
    }

    public static OwnProfileViewModel i(ul3 ul3Var) {
        return new OwnProfileViewModel(ul3Var);
    }

    public static MynetSearchViewModel j(jd7 jd7Var) {
        return new MynetSearchViewModel(jd7Var);
    }

    public static OtherAccountFollowersViewModel k(r79 r79Var, jd7 jd7Var) {
        return new OtherAccountFollowersViewModel(r79Var, jd7Var);
    }

    public static OtherAccountFollowingViewModel l(pj9 pj9Var, jd7 jd7Var) {
        return new OtherAccountFollowingViewModel(pj9Var, jd7Var);
    }

    public static e m() {
        return new e();
    }

    public static dv2 n(rl3 rl3Var, Context context) {
        rl3Var.getClass();
        return new dv2(context);
    }

    public static ir.mservices.market.version2.manager.install.e o(rl3 rl3Var, t32 t32Var) {
        rl3Var.getClass();
        js3.p(t32Var, "eventBus");
        return new ir.mservices.market.version2.manager.install.e(t32Var);
    }

    public static lw8 p(rl3 rl3Var, Context context) {
        rl3Var.getClass();
        return new lw8(context);
    }
}
