package ir.mservices.market.version2.fragments.task;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.DocumentsContract;
import android.text.TextUtils;
import androidx.fragment.app.d;
import defpackage.a77;
import defpackage.dw1;
import defpackage.jq5;
import defpackage.k68;
import defpackage.kq5;
import defpackage.lq5;
import defpackage.lw;
import defpackage.rn6;
import defpackage.zb2;
import ir.mservices.market.pika.common.model.NearbyRepository;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class ObbMoveBackFragment extends d {
    public static final String B0 = dw1.s(new StringBuilder("primary:Android"), File.separator, "obb");
    public lq5 A0;

    public static rn6 A0(Activity activity2, Uri uri) {
        Uri uriCreateDocument;
        rn6 rn6VarK = rn6.k(activity2, uri);
        if (rn6VarK.j(NearbyRepository.SERVICE_ID) != null) {
            return rn6VarK.j(NearbyRepository.SERVICE_ID);
        }
        Context context = (Context) rn6VarK.b;
        try {
            uriCreateDocument = DocumentsContract.createDocument(context.getContentResolver(), (Uri) rn6VarK.c, "vnd.android.document/directory", NearbyRepository.SERVICE_ID);
        } catch (Exception unused) {
            uriCreateDocument = null;
        }
        if (uriCreateDocument != null) {
            return new rn6(context, uriCreateDocument, 10);
        }
        return null;
    }

    public static String B0(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(B0);
        return dw1.s(sb, File.separator, str);
    }

    public static String C0(String str) {
        return str.replace(k68.f, B0 + File.separator);
    }

    public static String[] D0(String str) {
        return str.replace(k68.f, "").split(File.separator);
    }

    public static jq5 z0(ObbMoveBackFragment obbMoveBackFragment, Activity activity2, String[] strArr) throws Throwable {
        if (Build.VERSION.SDK_INT <= 29) {
            return new jq5(false);
        }
        for (String str : strArr) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    Uri uriBuildTreeDocumentUri = Build.VERSION.SDK_INT <= 29 ? null : DocumentsContract.buildTreeDocumentUri("com.android.externalstorage.documents", "primary:Android/obb");
                    rn6 rn6VarA0 = A0(activity2, uriBuildTreeDocumentUri);
                    if (rn6VarA0 == null) {
                        lw.g(null, "ObbMoveBackDocumentFile.doInBackground() can't create directory in obb", null);
                        return new jq5(false);
                    }
                    String[] strArrD0 = D0(str);
                    Uri uriBuildDocumentUriUsingTree = DocumentsContract.buildDocumentUriUsingTree(uriBuildTreeDocumentUri, C0(str));
                    Uri uriBuildDocumentUriUsingTree2 = DocumentsContract.buildDocumentUriUsingTree(uriBuildTreeDocumentUri, B0(strArrD0[0]));
                    rn6 rn6VarK = rn6.k(activity2, uriBuildDocumentUriUsingTree);
                    if (rn6VarA0.j(strArrD0[1]) == null) {
                        if (!rn6VarK.i()) {
                            lw.g(null, "ObbMoveBackDocumentFile.doInBackground() srcFile is not exist", null);
                            return new jq5(false);
                        }
                        if (DocumentsContract.moveDocument(activity2.getContentResolver(), uriBuildDocumentUriUsingTree, uriBuildDocumentUriUsingTree2, (Uri) rn6VarA0.c) == null) {
                            lw.g(null, "ObbMoveBackDocumentFile.doInBackground() DocumentContract.moveDocument() failed!!", null);
                            return new jq5(false);
                        }
                    }
                    obbMoveBackFragment.E0(strArrD0[1]);
                } catch (FileNotFoundException e) {
                    lw.g(e, "ObbMoveBackDocumentFile.doInBackground() exit with an FileNotFoundException! ", null);
                    return new jq5(false);
                } catch (IllegalStateException e2) {
                    lw.g(e2, "ObbMoveBackDocumentFile.doInBackground() exit with an  IllegalStateException! ", null);
                    return new jq5(false);
                } catch (Exception e3) {
                    lw.g(e3, "ObbMoveBackDocumentFile.doInBackground() exit with an  Exception! ", null);
                    return new jq5(false);
                }
            }
        }
        return new jq5(true);
    }

    public final void E0(String str) throws Throwable {
        try {
            File file = new File(this.g.getString("BUNDLE_KEY_DESTINATION_FOLDER"));
            StringBuilder sb = new StringBuilder();
            String str2 = k68.e;
            sb.append(a77.k());
            sb.append(str);
            File file2 = new File(sb.toString());
            File file3 = new File(file, file2.getName());
            if (!file.mkdirs() && !file.exists()) {
                lw.g(null, "ObbMoveBackFragment moveToDownloadDir failed! downloadFolder not exist and can't create", null);
                return;
            }
            if (file2.exists() && !file3.exists()) {
                zb2.i(file2, file3);
                return;
            }
            lw.g(null, "ObbMoveBackFragment moveToDownloadDir failed!", "obbFile.exist() =" + file2.exists() + "dataFile.exists() =" + file3.exists());
        } catch (IOException e) {
            lw.g(null, "ObbMoveBackFragment moveToDownloadDir failed! with exception =" + e.getMessage(), null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.d
    public final void W(Context context) {
        super.W(context);
        if (!(context instanceof lq5)) {
            throw new IllegalStateException("Activity must implement fragment's callbacks.");
        }
        this.A0 = (lq5) context;
    }

    @Override // androidx.fragment.app.d
    public final void X(Bundle bundle) {
        super.X(bundle);
        String string = this.g.getString("BUNDLE_KEY_DESTINATION_FOLDER");
        String[] stringArray = this.g.getStringArray("BUNDLE_KEY_FILES");
        w0();
        new kq5(this, F(), string).b(stringArray);
    }

    @Override // androidx.fragment.app.d
    public final void c0() {
        this.H = true;
        this.A0 = null;
    }
}
