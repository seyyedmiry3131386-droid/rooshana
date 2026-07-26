package ir.mservices.market.version2.fragments.task;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.d;
import defpackage.a77;
import defpackage.bc2;
import defpackage.bl4;
import defpackage.dw1;
import defpackage.dy3;
import defpackage.k68;
import defpackage.lw;
import defpackage.nq5;
import defpackage.oq5;
import defpackage.p3;
import defpackage.pq5;
import defpackage.rn6;
import defpackage.sb7;
import defpackage.zb2;
import ir.mservices.market.pika.common.model.NearbyRepository;
import ir.mservices.market.version2.activity.ObbMoveActivity;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class ObbMoveFragment extends d {
    public static final String D0;
    public String A0;
    public String[] B0;
    public pq5 C0;

    static {
        StringBuilder sb = new StringBuilder("primary:Android");
        String str = File.separator;
        D0 = bl4.z(sb, str, "obb", str);
    }

    public static rn6 A0(Activity activity2, String str) {
        Uri uriCreateDocument;
        rn6 rn6VarK = rn6.k(activity2, Build.VERSION.SDK_INT <= 29 ? null : DocumentsContract.buildTreeDocumentUri("com.android.externalstorage.documents", "primary:Android/obb"));
        if (!rn6VarK.i()) {
            return null;
        }
        if (rn6VarK.j(str) != null) {
            return rn6VarK.j(str);
        }
        Context context = (Context) rn6VarK.b;
        try {
            uriCreateDocument = DocumentsContract.createDocument(context.getContentResolver(), (Uri) rn6VarK.c, "vnd.android.document/directory", str);
        } catch (Exception unused) {
            uriCreateDocument = null;
        }
        if (uriCreateDocument != null) {
            return new rn6(context, uriCreateDocument, 10);
        }
        return null;
    }

    public static String B0() {
        return dw1.s(new StringBuilder(), D0, NearbyRepository.SERVICE_ID);
    }

    public static nq5 z0(ObbMoveFragment obbMoveFragment, Activity activity2, String str, String[] strArr) throws Throwable {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 29;
        if (Build.VERSION.SDK_INT <= 29) {
            return new nq5(0);
        }
        int length = strArr.length;
        int i5 = 0;
        while (i5 < length) {
            String str2 = strArr[i5];
            if (!TextUtils.isEmpty(str2)) {
                try {
                    try {
                        Uri uriBuildTreeDocumentUri = Build.VERSION.SDK_INT <= i4 ? null : DocumentsContract.buildTreeDocumentUri("com.android.externalstorage.documents", "primary:Android/obb");
                        rn6 rn6VarA0 = A0(activity2, str);
                        if (rn6VarA0 != null) {
                            sb7.p("ObbMoveFragment", "Switched to document file: obbDir", "dirPath:" + ((Uri) rn6VarA0.c).getPath() + "dirIsExist:" + rn6VarA0.i() + "dirCanRead:" + rn6VarA0.g() + "dirCanWrite:" + rn6VarA0.h() + "dirIsDirectory:" + rn6VarA0.p() + "SDcardState:" + Environment.getExternalStorageState());
                        }
                        if (rn6VarA0 != null) {
                            try {
                                if (rn6VarA0.i()) {
                                    String strA = bc2.a(str2);
                                    if (rn6VarA0.j(strA) != null) {
                                        return new nq5(4);
                                    }
                                    String strC0 = obbMoveFragment.C0(i3, str2);
                                    if (TextUtils.isEmpty(strC0)) {
                                        return new nq5(i3);
                                    }
                                    Uri uriBuildDocumentUriUsingTree = DocumentsContract.buildDocumentUriUsingTree(uriBuildTreeDocumentUri, strC0.replace(k68.f, D0));
                                    Uri uriBuildDocumentUriUsingTree2 = DocumentsContract.buildDocumentUriUsingTree(uriBuildTreeDocumentUri, B0());
                                    Uri uri = (Uri) rn6VarA0.c;
                                    if (!rn6.k(activity2, uriBuildDocumentUriUsingTree).i()) {
                                        rn6.k(activity2, uriBuildDocumentUriUsingTree);
                                    } else if (DocumentsContract.moveDocument(activity2.getContentResolver(), uriBuildDocumentUriUsingTree, uriBuildDocumentUriUsingTree2, uri) == null) {
                                        lw.g(null, "ObbMoveDocumentFile.doInBackground() DocumentContract.moveDocument() failed!!", null);
                                        return new nq5(i3);
                                    }
                                    if (!TextUtils.isEmpty(strA)) {
                                        rn6[] rn6VarArrR = rn6VarA0.r();
                                        int length2 = rn6VarArrR.length;
                                        for (int i6 = i3; i6 < length2; i6++) {
                                            rn6 rn6Var = rn6VarArrR[i6];
                                            if (!strA.equals(dy3.J((Context) rn6Var.b, (Uri) rn6Var.c, "_display_name"))) {
                                                try {
                                                    DocumentsContract.deleteDocument(((Context) rn6Var.b).getContentResolver(), (Uri) rn6Var.c);
                                                } catch (Exception unused) {
                                                }
                                            }
                                        }
                                    }
                                }
                            } catch (FileNotFoundException e) {
                                e = e;
                                i2 = 0;
                                obbMoveFragment.C0(1, str2);
                                lw.g(e, "ObbMoveDocumentFile.doInBackground() exit with an FileNotFoundException! ", null);
                                return new nq5(i2);
                            } catch (IllegalStateException e2) {
                                e = e2;
                                i = 0;
                                obbMoveFragment.C0(1, str2);
                                lw.g(e, "ObbMoveDocumentFile.doInBackground() exit with an  IllegalStateException! ", null);
                                return new nq5(i);
                            }
                        }
                        obbMoveFragment.C0(1, str2);
                        lw.g(null, "ObbMoveDocumentFile : can not identify Obb directory!", null);
                        return new nq5(2);
                    } catch (Exception e3) {
                        obbMoveFragment.C0(1, str2);
                        lw.g(e3, "ObbMoveDocumentFile.doInBackground() exit with an  Exception! ", null);
                        return new nq5(0);
                    }
                } catch (FileNotFoundException e4) {
                    e = e4;
                    i2 = i3;
                } catch (IllegalStateException e5) {
                    e = e5;
                    i = i3;
                }
            }
            i5++;
            i3 = 0;
            i4 = 29;
        }
        return new nq5(4);
    }

    public final String C0(int i, String str) throws Throwable {
        try {
            File file = new File(str);
            String str2 = k68.e;
            File file2 = new File(a77.k());
            File file3 = new File(file2, file.getName());
            if (i == 0) {
                if (file2.mkdirs() || file2.exists()) {
                    if (!file3.exists() && file.exists()) {
                        zb2.i(file, file3);
                        return file3.getPath();
                    }
                    if (file3.exists()) {
                        return file3.getPath();
                    }
                }
            } else {
                if (file3.exists() && !file.exists()) {
                    zb2.i(file3, file);
                    return file.getPath();
                }
                if (file.exists()) {
                    return file.getPath();
                }
            }
            return "";
        } catch (IOException unused) {
            lw.g(null, "ObbMoveFragment moveToObbDir failed moveState=" + i, null);
            ((ObbMoveActivity) this.C0).m0(new nq5(0));
            return "";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.d
    public final void W(Context context) {
        super.W(context);
        if (!(context instanceof pq5)) {
            throw new IllegalStateException("Activity must implement fragment's callbacks.");
        }
        this.C0 = (pq5) context;
    }

    @Override // androidx.fragment.app.d
    public final void X(Bundle bundle) {
        super.X(bundle);
        this.A0 = this.g.getString("BUNDLE_KEY_DESTINATION_FOLDER");
        this.B0 = this.g.getStringArray("BUNDLE_KEY_FILES");
        w0();
        if (p3.b(this.A0) || p3.d(F())) {
            String str = this.A0;
            new oq5(this, F(), str).b(this.B0);
            return;
        }
        FragmentActivity fragmentActivityF = F();
        if (Build.VERSION.SDK_INT <= 29) {
            return;
        }
        Uri uriBuildDocumentUri = DocumentsContract.buildDocumentUri("com.android.externalstorage.documents", "primary:Android/obb");
        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
        intent.putExtra("android.provider.extra.INITIAL_URI", uriBuildDocumentUri);
        fragmentActivityF.startActivityForResult(intent, 3000);
    }

    @Override // androidx.fragment.app.d
    public final void c0() {
        this.H = true;
        this.C0 = null;
    }
}
