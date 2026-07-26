package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.fragment.app.FragmentActivity;
import ir.mservices.market.togo.TogoFragment;
import java.io.File;
import java.io.IOException;
import kotlin.Result;
import kotlin.b;

/* JADX INFO: loaded from: classes3.dex */
public final class vm8 extends d91 {
    public final /* synthetic */ TogoFragment d;
    public final /* synthetic */ FragmentActivity e;
    public final /* synthetic */ String f;
    public final /* synthetic */ TogoFragment.MyketInterface g;

    public vm8(TogoFragment togoFragment, FragmentActivity fragmentActivity, String str, TogoFragment.MyketInterface myketInterface) {
        this.d = togoFragment;
        this.e = fragmentActivity;
        this.f = str;
        this.g = myketInterface;
    }

    @Override // defpackage.ve8
    public final void i(Object obj, ir8 ir8Var) {
        Object objA;
        k68 k68Var;
        Bitmap bitmap = (Bitmap) obj;
        TogoFragment.MyketInterface myketInterface = this.g;
        String str = this.f;
        TogoFragment togoFragment = this.d;
        k68 k68Var2 = togoFragment.c1;
        if (k68Var2 == null) {
            js3.V("storageUtils");
            throw null;
        }
        try {
            String str2 = lu7.b0;
            js3.o(str2, "KEY_EXTERNAL_FILE_DIRECTORY_PATH");
            zb2.g(new File(new File(k68Var2.g(str2, "photo")) + "/photo_togo.png"));
        } catch (IOException unused) {
        }
        FragmentActivity fragmentActivity = this.e;
        try {
            k68Var = togoFragment.c1;
        } catch (Throwable th) {
            objA = b.a(th);
        }
        if (k68Var == null) {
            js3.V("storageUtils");
            throw null;
        }
        String str3 = lu7.b0;
        js3.o(str3, "KEY_EXTERNAL_FILE_DIRECTORY_PATH");
        au7.c(fragmentActivity, bitmap, new File(k68Var.g(str3, "photo")) + "/photo_togo.png", str == null ? "" : str, new v25(myketInterface, str, 28));
        objA = tx8.a;
        if (Result.a(objA) != null) {
            myketInterface.shareText(str);
        }
    }

    @Override // defpackage.ve8
    public final void j(Drawable drawable) {
        this.g.shareText(this.f);
    }
}
