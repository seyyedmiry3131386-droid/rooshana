package ir.mservices.market.version2.fragments.base;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.strictmode.FragmentStrictMode$Flag;
import androidx.fragment.app.strictmode.GetRetainInstanceUsageViolation;
import defpackage.bz2;
import defpackage.dt2;
import defpackage.ee;
import defpackage.is3;
import defpackage.lw;
import defpackage.lw8;
import defpackage.p40;
import defpackage.sb7;
import defpackage.t32;
import defpackage.w91;
import defpackage.wl2;
import defpackage.x57;
import defpackage.ym2;
import defpackage.z80;
import defpackage.zm2;
import ir.mservices.market.version2.ApplicationLauncher;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseDialogFragment extends bz2 implements z80 {
    public static final String a1 = BaseDialogFragment.class + "_BUNDLE_KEY_SUBSCRIBER_ID";
    public static final String b1 = BaseDialogFragment.class + "_BUNDLE_KEY_SAVED_DATA";
    public OnDialogResultEvent V0;
    public String W0;
    public Bundle X0;
    public x57 Y0;
    public lw8 Z0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class DialogResult {
        public static final DialogResult a;
        public static final DialogResult b;
        public static final /* synthetic */ DialogResult[] c;

        static {
            DialogResult dialogResult = new DialogResult("COMMIT", 0);
            a = dialogResult;
            DialogResult dialogResult2 = new DialogResult("CANCEL", 1);
            b = dialogResult2;
            c = new DialogResult[]{dialogResult, dialogResult2};
        }

        public static DialogResult valueOf(String str) {
            return (DialogResult) Enum.valueOf(DialogResult.class, str);
        }

        public static DialogResult[] values() {
            return (DialogResult[]) c.clone();
        }
    }

    @Override // defpackage.z80
    public final String C() {
        return "dialog:".concat(I0());
    }

    public abstract String I0();

    public final void J0(DialogResult dialogResult) {
        OnDialogResultEvent onDialogResultEvent = this.V0;
        if (onDialogResultEvent == null) {
            lw.g(null, "dialogResultEvent is null!", null);
            return;
        }
        Bundle bundle = onDialogResultEvent.b;
        lw.d(null, null, bundle);
        boolean z = bundle.getBoolean("BUNDLE_KEY_ALSO_SEND_STICKY", false);
        OnDialogResultEvent onDialogResultEvent2 = this.V0;
        onDialogResultEvent2.getClass();
        lw.d(null, null, dialogResult);
        onDialogResultEvent2.c = dialogResult;
        OnDialogResultEvent onDialogResultEvent3 = this.V0;
        FragmentActivity fragmentActivityF = F();
        onDialogResultEvent3.getClass();
        lw.d(null, null, fragmentActivityF);
        t32.b().g(this.V0);
        if (z) {
            t32.b().j(new b());
        }
    }

    public final void K0(wl2 wl2Var) {
        try {
            if (Q() || wl2Var.G(I0()) != null) {
                return;
            }
            String strI0 = I0();
            this.N0 = false;
            this.O0 = true;
            p40 p40Var = new p40(wl2Var);
            p40Var.p = true;
            p40Var.h(0, this, strI0, 1);
            p40Var.g();
        } catch (RuntimeException unused) {
        }
    }

    @Override // defpackage.bz2, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public void W(Context context) {
        super.W(context);
        sb7.p("MyketBaseDialog", C() + " onAttach()", "");
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void X(Bundle bundle) {
        super.X(bundle);
        if (bundle == null || bundle.isEmpty()) {
            long j = is3.p + 1;
            is3.p = j;
            this.W0 = String.valueOf(j);
        } else {
            this.W0 = bundle.getString(a1);
            this.X0 = bundle.getBundle(b1);
        }
        Bundle bundle2 = this.X0;
        if (bundle2 != null) {
            this.V0 = (OnDialogResultEvent) dt2.p(bundle2, "BUNDLE_KEY_DIALOG_RESULT", OnDialogResultEvent.class);
        }
        if (C() != null && (bundle == null || bundle.isEmpty())) {
            String strC = C();
            Bundle bundle3 = new Bundle();
            ee eeVar = (ee) ((w91) ApplicationLauncher.o.b()).o.get();
            bundle3.putString("screen_name", strC);
            eeVar.getClass();
            eeVar.a(bundle3, "screen_show");
        }
        if (bundle != null) {
            bundle.isEmpty();
        }
    }

    @Override // androidx.fragment.app.d
    public final void a0() {
        this.H = true;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public void b0() {
        if (this.L0 != null) {
            ym2 ym2Var = zm2.a;
            GetRetainInstanceUsageViolation getRetainInstanceUsageViolation = new GetRetainInstanceUsageViolation(this, "Attempting to get retain instance for fragment " + this);
            zm2.c(getRetainInstanceUsageViolation);
            ym2 ym2VarA = zm2.a(this);
            if (ym2VarA.a.contains(FragmentStrictMode$Flag.f) && zm2.e(ym2VarA, getClass(), GetRetainInstanceUsageViolation.class)) {
                zm2.b(ym2VarA, getRetainInstanceUsageViolation);
            }
            if (this.E) {
                this.L0.setDismissMessage(null);
            }
        }
        this.Y0.a(this);
        Bundle bundle = new Bundle();
        bundle.putParcelable("BUNDLE_KEY_DIALOG_RESULT", this.V0);
        this.X0 = bundle;
        super.b0();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void c0() {
        super.c0();
        sb7.p("MyketBaseDialog", C() + " onDetach()", "");
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public void h0(Bundle bundle) {
        super.h0(bundle);
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("BUNDLE_KEY_DIALOG_RESULT", this.V0);
        this.X0 = bundle2;
        bundle.putString(a1, this.W0);
        bundle.putBundle(b1, this.X0);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        J0(DialogResult.b);
    }

    @Override // androidx.fragment.app.DialogFragment
    public final void z0() {
        Dialog dialog = this.L0;
        if (dialog != null) {
            lw8 lw8Var = this.Z0;
            View currentFocus = dialog.getCurrentFocus();
            lw8Var.getClass();
            lw8.a(currentFocus);
        }
        try {
            A0(false, false);
        } catch (IllegalStateException e) {
            lw.g(e, "cannot dismiss dialog", "tag: ".concat(I0()));
        }
    }

    public static class OnDialogResultEvent implements Parcelable {
        public static final Parcelable.Creator<OnDialogResultEvent> CREATOR = new a();
        public final String a;
        public final Bundle b;
        public DialogResult c;

        public OnDialogResultEvent(Bundle bundle, String str) {
            lw.d(null, null, str);
            this.a = str;
            this.b = bundle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.a);
            parcel.writeBundle(this.b);
            DialogResult dialogResult = this.c;
            if (dialogResult != null) {
                parcel.writeString(dialogResult.name());
            } else {
                parcel.writeString("NoName");
            }
        }

        public OnDialogResultEvent(Parcel parcel) {
            this.a = parcel.readString();
            this.b = parcel.readBundle(getClass().getClassLoader());
            String string = parcel.readString();
            if (TextUtils.isEmpty(string) || "NoName".equalsIgnoreCase(string)) {
                return;
            }
            this.c = DialogResult.valueOf(string);
        }
    }
}
