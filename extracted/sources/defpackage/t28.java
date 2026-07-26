package defpackage;

import ir.mservices.market.download.common.model.MovieDownloadType;

/* JADX INFO: loaded from: classes3.dex */
public final class t28 implements nr1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ u28 b;

    public /* synthetic */ t28(u28 u28Var, int i) {
        this.a = i;
        this.b = u28Var;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // defpackage.nr1
    public final void j(bs1 bs1Var) {
        switch (this.a) {
        }
        js3.p(bs1Var, "downloadInfo");
    }

    @Override // defpackage.nr1
    public final void n(es1 es1Var, int i) {
        String str;
        int i2 = this.a;
        u28 u28Var = this.b;
        js3.p(es1Var, "downloadInfo");
        switch (i2) {
            case 0:
                u28.a(u28Var, es1Var, i, eq.s(es1Var));
                break;
            default:
                String str2 = es1Var.d;
                js3.o(str2, "getKey(...)");
                if (js3.i(f88.y0(str2, new String[]{"/"}, 6).get(2), "media")) {
                    MovieDownloadType[] movieDownloadTypeArr = MovieDownloadType.a;
                    str = "movie/media";
                } else {
                    MovieDownloadType[] movieDownloadTypeArr2 = MovieDownloadType.a;
                    str = "movie/sub";
                }
                u28.a(u28Var, es1Var, i, str);
                break;
        }
    }
}
