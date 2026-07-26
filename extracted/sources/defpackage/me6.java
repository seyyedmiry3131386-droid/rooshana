package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import ir.myket.movie.common.domain.models.MovieType;
import ir.myket.player.domain.models.PlayerMovie;
import ir.myket.player.domain.models.ShareModel;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class me6 implements jr2 {
    public static final me6 a;
    private static final no7 descriptor;

    static {
        me6 me6Var = new me6();
        a = me6Var;
        ug6 ug6Var = new ug6("ir.myket.player.domain.models.PlayerMovie", me6Var, 6);
        ug6Var.j("movieId", false);
        ug6Var.j("playId", false);
        ug6Var.j("title", false);
        ug6Var.j("posterUrl", false);
        ug6Var.j("type", false);
        ug6Var.j("shareModel", false);
        descriptor = ug6Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.jr2
    public final px3[] childSerializers() {
        c24[] c24VarArr = PlayerMovie.g;
        b88 b88Var = b88.a;
        return new px3[]{b88Var, ct2.n(b88Var), b88Var, b88Var, c24VarArr[4].getValue(), ct2.n(qt7.a)};
    }

    @Override // defpackage.px3
    public final Object deserialize(cc1 cc1Var) {
        no7 no7Var = descriptor;
        tz0 tz0VarC = cc1Var.c(no7Var);
        c24[] c24VarArr = PlayerMovie.g;
        int i = 0;
        String strO = null;
        String str = null;
        String strO2 = null;
        String strO3 = null;
        MovieType movieType = null;
        ShareModel shareModel = null;
        boolean z = true;
        while (z) {
            int i2 = tz0VarC.i(no7Var);
            switch (i2) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strO = tz0VarC.o(no7Var, 0);
                    i |= 1;
                    break;
                case 1:
                    str = (String) tz0VarC.z(no7Var, 1, b88.a, str);
                    i |= 2;
                    break;
                case 2:
                    strO2 = tz0VarC.o(no7Var, 2);
                    i |= 4;
                    break;
                case 3:
                    strO3 = tz0VarC.o(no7Var, 3);
                    i |= 8;
                    break;
                case 4:
                    movieType = (MovieType) tz0VarC.s(no7Var, 4, (px3) c24VarArr[4].getValue(), movieType);
                    i |= 16;
                    break;
                case 5:
                    shareModel = (ShareModel) tz0VarC.z(no7Var, 5, qt7.a, shareModel);
                    i |= 32;
                    break;
                default:
                    throw new UnknownFieldException(i2);
            }
        }
        tz0VarC.a(no7Var);
        return new PlayerMovie(i, strO, str, strO2, strO3, movieType, shareModel);
    }

    @Override // defpackage.px3
    public final no7 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.px3
    public final void serialize(q12 q12Var, Object obj) {
        PlayerMovie playerMovie = (PlayerMovie) obj;
        js3.p(playerMovie, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        no7 no7Var = descriptor;
        uz0 uz0VarC = q12Var.c(no7Var);
        c24[] c24VarArr = PlayerMovie.g;
        uz0VarC.w(no7Var, 0, playerMovie.a);
        uz0VarC.z(no7Var, 1, b88.a, playerMovie.b);
        uz0VarC.w(no7Var, 2, playerMovie.c);
        uz0VarC.w(no7Var, 3, playerMovie.d);
        uz0VarC.o(no7Var, 4, (px3) c24VarArr[4].getValue(), playerMovie.e);
        uz0VarC.z(no7Var, 5, qt7.a, playerMovie.f);
        uz0VarC.a(no7Var);
    }

    @Override // defpackage.jr2
    public final /* bridge */ px3[] typeParametersSerializers() {
        return at2.t;
    }
}
