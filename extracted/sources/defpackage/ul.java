package defpackage;

import android.R;
import android.app.Application;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Picture;
import android.graphics.Typeface;
import android.graphics.drawable.Icon;
import android.icu.text.DecimalFormatSymbols;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.StrictMode;
import android.text.PrecomputedText;
import android.text.StaticLayout;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewStructure;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassificationContext;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.foundation.text.selection.SelectedTextType;
import com.google.android.gms.internal.common.zzy;
import io.sentry.android.core.t0;
import io.sentry.instrumentation.file.d;
import io.sentry.instrumentation.file.f;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public abstract class ul {
    public static String a;
    public static int b;
    public static Boolean c;

    public static int A(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    public static int B(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    public static int C(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }

    public static void D(TextView textView, int i) {
        textView.setFirstBaselineToTopHeight(i);
    }

    public static void E(ViewStructure viewStructure, int i) {
        viewStructure.setMaxTextLength(i);
    }

    public static void F(int i, View view) {
        view.setOutlineAmbientShadowColor(i);
    }

    public static void G(int i, View view) {
        view.setOutlineSpotShadowColor(i);
    }

    public static void H(Notification.Action.Builder builder) {
        builder.setSemanticAction(0);
    }

    public static final void I(StaticLayout.Builder builder) {
        builder.setUseLineSpacingFromFallbacks(true);
    }

    public static boolean J(ViewConfiguration viewConfiguration) {
        return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
    }

    public static boolean K() {
        Boolean boolValueOf = c;
        if (boolValueOf == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                boolValueOf = Boolean.valueOf(Process.isIsolated());
            } else {
                try {
                    Object objInvoke = Process.class.getDeclaredMethod("isIsolated", null).invoke(null, null);
                    Object[] objArr = new Object[0];
                    if (objInvoke == null) {
                        throw new zzy(lb7.m("expected a non-null reference", objArr));
                    }
                    boolValueOf = (Boolean) objInvoke;
                } catch (ReflectiveOperationException unused) {
                    boolValueOf = Boolean.FALSE;
                }
            }
            c = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    public static void a(RemoteAction remoteAction) throws PendingIntent.CanceledException {
        PendingIntent actionIntent = remoteAction.getActionIntent();
        if (Build.VERSION.SDK_INT >= 34) {
            i3.v(actionIntent);
        } else {
            actionIntent.send();
        }
    }

    public static final DisplayCutout b(Display display) throws Exception {
        try {
            Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(null);
            constructor.setAccessible(true);
            Object objNewInstance = constructor.newInstance(null);
            Method declaredMethod = display.getClass().getDeclaredMethod("getDisplayInfo", objNewInstance.getClass());
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(display, objNewInstance);
            Field declaredField = objNewInstance.getClass().getDeclaredField("displayCutout");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(objNewInstance);
            if (obj instanceof DisplayCutout) {
                return (DisplayCutout) obj;
            }
            return null;
        } catch (Exception e) {
            if (!(e instanceof ClassNotFoundException) && !(e instanceof NoSuchMethodException) && !(e instanceof NoSuchFieldException) && !(e instanceof IllegalAccessException) && !(e instanceof InvocationTargetException) && !(e instanceof InstantiationException)) {
                throw e;
            }
            wf0.b0.getClass();
            t0.l(e, vf0.b);
            return null;
        }
    }

    public static void c(Menu menu, int i, Context context, TextClassification textClassification, int i2) {
        if (i2 < 0) {
            MenuItem menuItemAdd = menu.add(R.id.textAssist, R.id.textAssist, i, textClassification.getLabel());
            menuItemAdd.setShowAsAction(2);
            menuItemAdd.setIcon(textClassification.getIcon());
            menuItemAdd.setOnMenuItemClickListener(new fi(context, textClassification, 1));
            return;
        }
        boolean z = i2 == 0;
        final RemoteAction remoteAction = textClassification.getActions().get(i2);
        MenuItem menuItemAdd2 = menu.add(R.id.textAssist, z ? 16908353 : 0, i, remoteAction.getTitle());
        menuItemAdd2.setShowAsAction(z ? 2 : 0);
        if (z || remoteAction.shouldShowIcon()) {
            menuItemAdd2.setIcon(remoteAction.getIcon().loadDrawable(context));
        }
        menuItemAdd2.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: ij8
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) throws PendingIntent.CanceledException {
                ul.a(remoteAction);
                return true;
            }
        });
    }

    public static final void d(ClipboardManager clipboardManager) {
        clipboardManager.clearPrimaryClip();
    }

    public static Typeface e(Typeface typeface, int i, boolean z) {
        return Typeface.create(typeface, i, z);
    }

    public static Handler f(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static Handler g(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static Handler h(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static Bitmap i(Picture picture) {
        return Bitmap.createBitmap(picture);
    }

    public static TextClassifier j(Context context, SelectedTextType selectedTextType) {
        String str;
        TextClassificationManager textClassificationManager = (TextClassificationManager) context.getSystemService(TextClassificationManager.class);
        int iOrdinal = selectedTextType.ordinal();
        if (iOrdinal == 0) {
            str = "edittext";
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            str = "textview";
        }
        return textClassificationManager.createTextClassificationSession(new TextClassificationContext.Builder(context.getPackageName(), str).build());
    }

    public static List k(DisplayCutout displayCutout) {
        return displayCutout.getBoundingRects();
    }

    public static String[] l(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    public static Executor m(Context context) {
        return context.getMainExecutor();
    }

    public static String n() throws Throwable {
        BufferedReader bufferedReader;
        if (a == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                a = Application.getProcessName();
            } else {
                int iMyPid = b;
                if (iMyPid == 0) {
                    iMyPid = Process.myPid();
                    b = iMyPid;
                }
                String strTrim = null;
                strTrim = null;
                strTrim = null;
                BufferedReader bufferedReader2 = null;
                if (iMyPid > 0) {
                    try {
                        StringBuilder sb = new StringBuilder(String.valueOf(iMyPid).length() + 14);
                        sb.append("/proc/");
                        sb.append(iMyPid);
                        sb.append("/cmdline");
                        String string = sb.toString();
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            bufferedReader = new BufferedReader(new f(new d(string != null ? new File(string) : null)));
                            try {
                                String line = bufferedReader.readLine();
                                rq4.n(line);
                                strTrim = line.trim();
                            } catch (IOException unused) {
                            } catch (Throwable th) {
                                th = th;
                                bufferedReader2 = bufferedReader;
                                yq2.O(bufferedReader2);
                                throw th;
                            }
                        } finally {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        }
                    } catch (IOException unused2) {
                        bufferedReader = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    yq2.O(bufferedReader);
                }
                a = strTrim;
            }
        }
        return a;
    }

    public static int o(Object obj) {
        return ((Icon) obj).getResId();
    }

    public static String p(Object obj) {
        return ((Icon) obj).getResPackage();
    }

    public static int q(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    public static int r(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    public static int s(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    public static int t(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }

    public static int u(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHoverSlop();
    }

    public static PrecomputedText.Params v(AppCompatTextView appCompatTextView) {
        return appCompatTextView.getTextMetricsParams();
    }

    public static int w(Object obj) {
        return ((Icon) obj).getType();
    }

    public static Uri x(Object obj) {
        return ((Icon) obj).getUri();
    }

    public static void y(View view) {
        view.resetPivot();
    }

    public static int z(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }
}
