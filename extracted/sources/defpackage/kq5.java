package defpackage;

import android.app.Activity;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import ir.mservices.market.version2.activity.ObbMoveBackActivity;
import ir.mservices.market.version2.fragments.task.ObbMoveBackFragment;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileExistsException;

/* JADX INFO: loaded from: classes3.dex */
public final class kq5 extends mx {
    public final String i;
    public final Activity j;
    public final /* synthetic */ ObbMoveBackFragment k;

    public kq5(ObbMoveBackFragment obbMoveBackFragment, FragmentActivity fragmentActivity, String str) {
        this.k = obbMoveBackFragment;
        this.i = str;
        this.j = fragmentActivity;
    }

    @Override // defpackage.mx
    public final Object a(Object[] objArr) throws Throwable {
        String[] strArr = (String[]) objArr;
        Activity activity2 = this.j;
        if (p3.d(activity2)) {
            zk8.X(new IllegalStateException("DocumentFile moveToObbWithDocumentFile executed!!"), true);
            return ObbMoveBackFragment.z0(this.k, activity2, strArr);
        }
        String str = this.i;
        String str2 = ObbMoveBackFragment.B0;
        for (String str3 : strArr) {
            if (!TextUtils.isEmpty(str3)) {
                try {
                    File file = new File(str3);
                    File file2 = new File(str);
                    if (!file2.mkdirs() && !file2.isDirectory()) {
                        lw.g(null, "MoveBackResult.doInBackground() destFolder isn't directory and can't create it", null);
                        return new jq5(false);
                    }
                    File file3 = new File(file2, file.getName());
                    if (file3.exists()) {
                        continue;
                    } else {
                        if (!file.exists()) {
                            lw.g(null, "MoveBackResult.doInBackground() destFolder exist but srcFile is not exist", null);
                            return new jq5(false);
                        }
                        zb2.i(file, file3);
                    }
                } catch (FileExistsException unused) {
                    continue;
                } catch (IOException unused2) {
                    return new jq5(false);
                } catch (Exception e) {
                    lw.g(e, "MoveBackResult.doInBackground() exit with an Exception! ", null);
                    return new jq5(false);
                }
            }
        }
        return new jq5(true);
    }

    @Override // defpackage.mx
    public final void d(Object obj) {
        jq5 jq5Var = (jq5) obj;
        lq5 lq5Var = this.k.A0;
        if (lq5Var != null) {
            ObbMoveBackActivity obbMoveBackActivity = (ObbMoveBackActivity) lq5Var;
            if (jq5Var.a) {
                sb7.p("MyketContentActivity", "Rolling back data done successfully packageName:" + obbMoveBackActivity.W.getPackageName(), null);
            } else {
                sb7.p("MyketContentActivity", "Rolling back data failed!! packageName:" + obbMoveBackActivity.W.getPackageName(), null);
            }
            obbMoveBackActivity.d0(obbMoveBackActivity.X);
        }
    }
}
