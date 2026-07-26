package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import io.sentry.android.core.t0;

/* JADX INFO: loaded from: classes.dex */
public final class t67 {
    public final /* synthetic */ int a;

    public /* synthetic */ t67(int i) {
        this.a = i;
    }

    public final Drawable a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        switch (this.a) {
            case 0:
                String classAttribute = attributeSet.getClassAttribute();
                if (classAttribute != null) {
                    try {
                        Drawable drawable = (Drawable) t67.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(null).newInstance(null);
                        fx0.c(drawable, context.getResources(), xmlResourceParser, attributeSet, theme);
                    } catch (Exception e) {
                        t0.e("DrawableDelegate", "Exception while inflating <drawable>", e);
                        return null;
                    }
                }
                break;
            case 1:
                try {
                } catch (Exception e2) {
                    t0.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e2);
                    return null;
                }
                break;
            case 2:
                try {
                    Resources resources = context.getResources();
                    hk hkVar = new hk(context, 0);
                    hkVar.inflate(resources, xmlResourceParser, attributeSet, theme);
                } catch (Exception e3) {
                    t0.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e3);
                    return null;
                }
                break;
            default:
                try {
                    Resources resources2 = context.getResources();
                    q39 q39Var = new q39();
                    q39Var.inflate(resources2, xmlResourceParser, attributeSet, theme);
                } catch (Exception e4) {
                    t0.e("VdcInflateDelegate", "Exception while inflating <vector>", e4);
                    return null;
                }
                break;
        }
        return null;
    }
}
