package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import androidx.core.content.FileProvider;
import androidx.fragment.app.FragmentActivity;
import io.sentry.android.core.t0;
import io.sentry.config.a;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.version2.ui.crop.util.PhotoUtils$PhotoData;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes3.dex */
public final class g76 {
    public Context a;
    public lu7 b;

    public static byte[] a(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        File file = new File(str);
        dataOutputStream.writeBytes("--" + ib2.B + "\r\n");
        dataOutputStream.writeBytes("Content-Disposition: form-data; name=\"uploaded_file\"; filename=\"" + file.getName() + "\"\r\n");
        dataOutputStream.writeBytes("Content-Type: image/*\r\n");
        dataOutputStream.writeBytes("\r\n");
        FileInputStream fileInputStreamG = a.g(file, new FileInputStream(file));
        int iMin = Math.min(fileInputStreamG.available(), 1048576);
        byte[] bArr = new byte[iMin];
        int i = fileInputStreamG.read(bArr, 0, iMin);
        while (i > 0) {
            dataOutputStream.write(bArr, 0, iMin);
            iMin = Math.min(fileInputStreamG.available(), 1048576);
            i = fileInputStreamG.read(bArr, 0, iMin);
        }
        dataOutputStream.writeBytes("\r\n");
        dataOutputStream.writeBytes("--" + ib2.B + "--\r\n\r\n");
        return byteArrayOutputStream.toByteArray();
    }

    public static File b(Context context) {
        File file = "mounted".equals(Environment.getExternalStorageState()) ? new File(context.getExternalFilesDir(null), "photo") : new File(context.getFilesDir(), "photo");
        if (!file.mkdirs() && !file.exists()) {
            t0.d("SivaPU", "Directory not created");
        }
        return file;
    }

    public static void e(Activity activity2) {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.setType("image/*");
        if (intent.resolveActivity(activity2.getPackageManager()) != null) {
            activity2.startActivityForResult(intent, 9081);
        } else {
            hh2.H(new hh2(activity2, activity2.getString(rs6.uncatchable_intent)));
        }
    }

    public final void c(int i, int i2, Intent intent, FragmentActivity fragmentActivity, am2 am2Var, PhotoUtils$PhotoData photoUtils$PhotoData) {
        String str = photoUtils$PhotoData.b;
        String str2 = photoUtils$PhotoData.a;
        if (i == -1) {
            Uri uriFromFile = null;
            uriFromFile = null;
            File file = null;
            if (i2 == 9080) {
                File file2 = new File(b(fragmentActivity), this.b.f(lu7.q0, "temp.png"));
                if (file2.exists()) {
                    file = file2;
                } else {
                    t0.d("SivaPU", "Camera temp file note found");
                    hh2.H(s7.L(fragmentActivity, rs6.upload_problem));
                }
                if (file != null) {
                    pk5.h(am2Var, new NavIntentDirections.Crop(new t71(Uri.fromFile(file), str, str2)));
                    return;
                } else {
                    hh2.H(new hh2(fragmentActivity, fragmentActivity.getString(rs6.select_image_error)));
                    return;
                }
            }
            if (i2 == 9081) {
                if (intent.getData() != null) {
                    pk5.h(am2Var, new NavIntentDirections.Crop(new t71(intent.getData(), str, str2)));
                    return;
                } else {
                    hh2.H(new hh2(fragmentActivity, fragmentActivity.getString(rs6.select_image_error)));
                    return;
                }
            }
            if (i2 == 9082) {
                t32 t32VarB = t32.b();
                if (Environment.getExternalStorageState().equals("mounted")) {
                    try {
                        File file3 = new File(b(fragmentActivity), "crop_temp.png");
                        file3.createNewFile();
                        uriFromFile = Uri.fromFile(file3);
                    } catch (IOException unused) {
                    }
                }
                t32VarB.j(new s71(uriFromFile, true, str2));
            }
        }
    }

    public final void d(FragmentActivity fragmentActivity) {
        Object d87Var;
        String strI = t61.i(new SimpleDateFormat("yyMMdd_HHmmss", Locale.US).format(new Date(System.currentTimeMillis())), ".png");
        this.b.i(lu7.q0, strI);
        File file = new File(b(fragmentActivity), strI);
        Context context = this.a;
        Regex regex = fg5.a;
        js3.p(context, "context");
        Intent intent = new Intent();
        if (Build.VERSION.SDK_INT >= 24) {
            intent.addFlags(1);
            d87Var = new e87(intent.putExtra("output", FileProvider.d(context, file)));
        } else {
            d87Var = new d87();
        }
        if (d87Var instanceof d87) {
            intent.putExtra("output", Uri.fromFile(file));
        }
        intent.setAction("android.media.action.IMAGE_CAPTURE");
        if (intent.resolveActivity(fragmentActivity.getPackageManager()) != null) {
            fragmentActivity.startActivityForResult(intent, 9080);
        } else {
            hh2.H(new hh2(fragmentActivity, fragmentActivity.getString(rs6.uncatchable_intent)));
        }
    }
}
