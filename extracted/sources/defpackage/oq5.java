package defpackage;

import android.app.Activity;
import android.os.Build;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import ir.mservices.market.version2.activity.ObbMoveActivity;
import ir.mservices.market.version2.fragments.task.ObbMoveFragment;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.commons.io.FileExistsException;

/* JADX INFO: loaded from: classes3.dex */
public final class oq5 extends mx {
    public final String i;
    public final Activity j;
    public final /* synthetic */ ObbMoveFragment k;

    public oq5(ObbMoveFragment obbMoveFragment, FragmentActivity fragmentActivity, String str) {
        this.k = obbMoveFragment;
        this.i = str;
        this.j = fragmentActivity;
    }

    @Override // defpackage.mx
    public final Object a(Object[] objArr) throws Throwable {
        File[] fileArrListFiles;
        String[] strArr = (String[]) objArr;
        String str = this.i;
        js3.p(str, "destFilePath");
        if (Build.VERSION.SDK_INT > 29) {
            File file = new File(str);
            if ((!file.mkdirs() && !file.isDirectory()) || !file.canWrite()) {
                zk8.X(new IllegalStateException("DocumentFile moveToObbWithDocumentFile executed!!"), true);
                String str2 = ObbMoveFragment.D0;
                return ObbMoveFragment.z0(this.k, this.j, str.replace(k68.f, "").replace(File.separator, ""), strArr);
            }
        }
        String str3 = ObbMoveFragment.D0;
        ArrayList arrayList = new ArrayList();
        for (String str4 : strArr) {
            if (!TextUtils.isEmpty(str4)) {
                try {
                    File file2 = new File(str4);
                    File file3 = new File(str);
                    if (!file3.mkdirs() && !file3.isDirectory()) {
                        lw.g(null, "InstallResult.doInBackground() destFolder isn't directory and can't create it", null);
                        return new nq5(2);
                    }
                    File file4 = new File(file3, file2.getName());
                    arrayList.add(file4.getPath());
                    if (file4.exists()) {
                        continue;
                    } else {
                        if (!file2.exists()) {
                            lw.g(null, "InstallResult.doInBackground() destFolder exist but srcFile is not exist", null);
                            return new nq5(1);
                        }
                        zb2.i(file2, file4);
                    }
                } catch (FileExistsException unused) {
                    continue;
                } catch (IOException unused2) {
                    return wq2.l(new File(str4).length(), 0L) ? new nq5(0) : new nq5(3);
                } catch (Exception e) {
                    lw.g(e, "InstallResult.doInBackground() exit with an Exception! ", null);
                    return new nq5(0);
                }
            }
        }
        File file5 = new File(str);
        if (file5.exists() && file5.isDirectory() && (fileArrListFiles = file5.listFiles()) != null) {
            for (File file6 : fileArrListFiles) {
                if (!arrayList.contains(file6.getPath())) {
                    zb2.f(file6);
                }
            }
        }
        return new nq5(4);
    }

    @Override // defpackage.mx
    public final void d(Object obj) {
        nq5 nq5Var = (nq5) obj;
        pq5 pq5Var = this.k.C0;
        if (pq5Var != null) {
            ((ObbMoveActivity) pq5Var).m0(nq5Var);
        }
    }
}
