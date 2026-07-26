package ir.mservices.market.version2.fragments.dialog;

import android.os.Bundle;
import defpackage.rm1;
import ir.mservices.market.version2.fragments.dialog.ReportDialogFragment;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements rm1 {
    public final /* synthetic */ ReportDialogFragment a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ReportDialogFragment.Option[] c;

    public e(ReportDialogFragment reportDialogFragment, boolean z, ReportDialogFragment.Option[] optionArr) {
        this.a = reportDialogFragment;
        this.b = z;
        this.c = optionArr;
    }

    @Override // defpackage.rm1
    public final void onCancel() {
        ReportDialogFragment reportDialogFragment = this.a;
        reportDialogFragment.b1 = true;
        reportDialogFragment.R0(DialogResult.b, new Bundle());
    }

    @Override // defpackage.rm1
    public final void onCommit() {
        this.a.V0(this.b, this.c);
    }
}
