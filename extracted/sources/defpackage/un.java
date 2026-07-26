package defpackage;

import androidx.appcompat.widget.AppCompatSpinner;

/* JADX INFO: loaded from: classes.dex */
public final class un extends xj2 {
    public final /* synthetic */ ao j;
    public final /* synthetic */ AppCompatSpinner k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public un(AppCompatSpinner appCompatSpinner, AppCompatSpinner appCompatSpinner2, ao aoVar) {
        super(appCompatSpinner2);
        this.k = appCompatSpinner;
        this.j = aoVar;
    }

    @Override // defpackage.xj2
    public final mv7 b() {
        return this.j;
    }

    @Override // defpackage.xj2
    public final boolean c() {
        AppCompatSpinner appCompatSpinner = this.k;
        if (appCompatSpinner.getInternalPopup().b()) {
            return true;
        }
        appCompatSpinner.f.n(appCompatSpinner.getTextDirection(), appCompatSpinner.getTextAlignment());
        return true;
    }
}
