package ir.mservices.market.app.suggest.detail.ui;

import android.os.Parcelable;
import defpackage.bn6;
import defpackage.bt2;
import defpackage.hh2;
import defpackage.jd7;
import defpackage.js3;
import defpackage.k50;
import defpackage.la6;
import defpackage.pv6;
import defpackage.vy2;
import defpackage.y97;
import ir.mservices.market.pika.common.model.ByteArrayResult;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import ir.mservices.market.viewModel.c;
import java.io.Serializable;
import kotlinx.coroutines.flow.i;

/* JADX INFO: loaded from: classes3.dex */
public final class PlayDetailViewModel extends c {
    public final i A;
    public final pv6 B;
    public final i C;
    public final pv6 D;
    public final i E;
    public final pv6 F;
    public final bn6 t;
    public final hh2 u;
    public final k50 v;
    public final la6 w;
    public String x;
    public final i y;
    public final i z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayDetailViewModel(jd7 jd7Var, bn6 bn6Var, hh2 hh2Var, k50 k50Var) {
        super(true);
        js3.p(jd7Var, "savedStateHandle");
        this.t = bn6Var;
        this.u = hh2Var;
        this.v = k50Var;
        if (!jd7Var.a("packageName")) {
            throw new IllegalArgumentException("Required argument \"packageName\" is missing and does not have an android:defaultValue");
        }
        String str = (String) jd7Var.b("packageName");
        if (str == null) {
            throw new IllegalArgumentException("Argument \"packageName\" is marked as non-null but was passed a null value");
        }
        if (!jd7Var.a("title")) {
            throw new IllegalArgumentException("Required argument \"title\" is missing and does not have an android:defaultValue");
        }
        String str2 = (String) jd7Var.b("title");
        if (str2 == null) {
            throw new IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value");
        }
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
        this.w = new la6(dialogDataModel, str, str2);
        this.x = str2;
        this.y = vy2.e(0, 7, null);
        this.z = vy2.e(0, 7, null);
        i iVarE = vy2.e(0, 7, null);
        this.A = iVarE;
        this.B = new pv6(iVarE);
        i iVarE2 = vy2.e(0, 7, null);
        this.C = iVarE2;
        this.D = new pv6(iVarE2);
        i iVarE3 = vy2.e(0, 7, null);
        this.E = iVarE3;
        this.F = new pv6(iVarE3);
    }

    @Override // ir.mservices.market.viewModel.c
    public final void e() {
        bt2.G(y97.G(this), null, null, new PlayDetailViewModel$doRequest$1(this, null), 3);
    }

    public final void r(ErrorDTO errorDTO) {
        js3.p(errorDTO, ByteArrayResult.AppInfo.IMG_SERIALISED_NAME);
        bt2.G(y97.G(this), null, null, new PlayDetailViewModel$handleError$1(this, errorDTO, null), 3);
    }
}
