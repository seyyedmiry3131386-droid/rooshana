package defpackage;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Trace;
import com.j256.ormlite.field.FieldType;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class yh2 {
    public static final lg4 a = new lg4(2);
    public static final mh b = new mh(11);

    public static di1 a(Context context, List list) {
        String str;
        Typeface typefaceC;
        ia7.d("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                zh2 zh2Var = (zh2) list.get(i);
                if (Build.VERSION.SDK_INT < 31 || (typefaceC = dv8.c((str = zh2Var.e))) == null || dv8.d(typefaceC) == null) {
                    ProviderInfo providerInfoB = b(context.getPackageManager(), zh2Var, context.getResources());
                    if (providerInfoB == null) {
                        return new di1();
                    }
                    arrayList.add(c(context, zh2Var, providerInfoB.authority));
                } else {
                    arrayList.add(new hj2[]{new hj2(str, zh2Var.f)});
                }
            }
            return new di1(arrayList);
        } finally {
            Trace.endSection();
        }
    }

    public static ProviderInfo b(PackageManager packageManager, zh2 zh2Var, Resources resources) {
        mh mhVar = b;
        lg4 lg4Var = a;
        ia7.d("FontProvider.getProvider");
        try {
            List listW = zh2Var.d;
            String str = zh2Var.a;
            String str2 = zh2Var.b;
            if (listW == null) {
                listW = s7.W(resources, 0);
            }
            xh2 xh2Var = new xh2();
            xh2Var.a = str;
            xh2Var.b = str2;
            xh2Var.c = listW;
            ProviderInfo providerInfo = (ProviderInfo) lg4Var.get(xh2Var);
            if (providerInfo != null) {
                return providerInfo;
            }
            ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (providerInfoResolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
            }
            if (!providerInfoResolveContentProvider.packageName.equals(str2)) {
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
            }
            Signature[] signatureArr = packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures;
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            Collections.sort(arrayList, mhVar);
            for (int i = 0; i < listW.size(); i++) {
                ArrayList arrayList2 = new ArrayList((Collection) listW.get(i));
                Collections.sort(arrayList2, mhVar);
                if (arrayList.size() == arrayList2.size()) {
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        if (!Arrays.equals((byte[]) arrayList.get(i2), (byte[]) arrayList2.get(i2))) {
                            break;
                        }
                    }
                    lg4Var.put(xh2Var, providerInfoResolveContentProvider);
                    return providerInfoResolveContentProvider;
                }
            }
            Trace.endSection();
            return null;
        } finally {
            Trace.endSection();
        }
    }

    public static hj2[] c(Context context, zh2 zh2Var, String str) {
        ia7.d("FontProvider.query");
        try {
            ArrayList arrayList = new ArrayList();
            Uri uriBuild = new Uri.Builder().scheme("content").authority(str).build();
            Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            wh2 pt2Var = Build.VERSION.SDK_INT < 24 ? new pt2(context, uriBuild) : new ql4(context, uriBuild);
            Cursor cursorM = null;
            try {
                String[] strArr = {FieldType.FOREIGN_ID_FIELD_SUFFIX, "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                ia7.d("ContentQueryWrapper.query");
                try {
                    cursorM = pt2Var.m(uriBuild, strArr, new String[]{zh2Var.c});
                    Trace.endSection();
                    if (cursorM != null && cursorM.getCount() > 0) {
                        int columnIndex = cursorM.getColumnIndex("result_code");
                        ArrayList arrayList2 = new ArrayList();
                        int columnIndex2 = cursorM.getColumnIndex(FieldType.FOREIGN_ID_FIELD_SUFFIX);
                        int columnIndex3 = cursorM.getColumnIndex("file_id");
                        int columnIndex4 = cursorM.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursorM.getColumnIndex("font_weight");
                        int columnIndex6 = cursorM.getColumnIndex("font_italic");
                        while (cursorM.moveToNext()) {
                            int i = columnIndex != -1 ? cursorM.getInt(columnIndex) : 0;
                            arrayList2.add(new hj2(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorM.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorM.getLong(columnIndex3)), columnIndex4 != -1 ? cursorM.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursorM.getInt(columnIndex5) : ErrorDTO.CODE_ACCESS_DENIED, columnIndex6 != -1 && cursorM.getInt(columnIndex6) == 1, i));
                        }
                        arrayList = arrayList2;
                    }
                    if (cursorM != null) {
                        cursorM.close();
                    }
                    pt2Var.close();
                    return (hj2[]) arrayList.toArray(new hj2[0]);
                } finally {
                }
            } catch (Throwable th) {
                if (cursorM != null) {
                    cursorM.close();
                }
                pt2Var.close();
                throw th;
            }
        } finally {
        }
    }
}
