package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import androidx.core.content.FileProvider;
import io.sentry.config.a;
import ir.mservices.market.version2.webapi.responsedto.ConfirmDTO;
import ir.myket.core.R;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.Result;
import kotlin.b;

/* JADX INFO: loaded from: classes3.dex */
public final class au7 {
    public static void a(Context context, String str, bp2 bp2Var) {
        String string;
        js3.p(str, ConfirmDTO.INPUT_TYPE_TEXT);
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", str);
        if (context != null) {
            try {
                string = context.getString(R.string.core_share);
            } catch (ActivityNotFoundException unused) {
                bp2Var.invoke();
                return;
            }
        } else {
            string = null;
        }
        if (string == null) {
            string = "";
        }
        Intent intentAddFlags = Intent.createChooser(intent, string).addFlags(268435456);
        js3.o(intentAddFlags, "addFlags(...)");
        if (context != null) {
            context.startActivity(intentAddFlags);
        }
    }

    public static void c(Context context, Bitmap bitmap, String str, String str2, dp2 dp2Var) {
        Object objA;
        js3.p(str, "filePath");
        if (context == null) {
            return;
        }
        try {
            File file = new File(str);
            FileOutputStream fileOutputStreamK = a.k(new FileOutputStream(file), file);
            try {
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStreamK);
                fileOutputStreamK.close();
                Object e87Var = Build.VERSION.SDK_INT >= 24 ? new e87(FileProvider.d(context, file)) : new d87();
                Object objFromFile = e87Var instanceof d87 ? Uri.fromFile(file) : ((e87) e87Var).a;
                Intent intent = new Intent("android.intent.action.SEND");
                intent.addFlags(1);
                intent.putExtra("android.intent.extra.STREAM", (Uri) objFromFile);
                intent.putExtra("android.intent.extra.TEXT", str2);
                intent.setType("image/jpeg");
                context.startActivity(Intent.createChooser(intent, context.getString(R.string.core_share)));
                objA = tx8.a;
            } finally {
            }
        } catch (Throwable th) {
            objA = b.a(th);
        }
        Throwable thA = Result.a(objA);
        if (thA != null) {
            dp2Var.invoke(thA.getMessage());
        }
    }

    public static void d(Context context, Drawable drawable, String str, String str2, dp2 dp2Var) {
        js3.p(str, "filePath");
        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
        js3.o(bitmap, "getBitmap(...)");
        c(context, bitmap, str, str2, dp2Var);
    }
}
