package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import j$.util.Objects;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class y48 {
    public final int a;
    public final as7 b;
    public final int[][] c;
    public final as7[] d;
    public final x48 e;
    public final x48 f;
    public final x48 g;
    public final x48 h;

    public y48(re3 re3Var) {
        this.a = re3Var.b;
        this.b = (as7) re3Var.c;
        this.c = (int[][]) re3Var.d;
        this.d = (as7[]) re3Var.e;
        this.e = (x48) re3Var.f;
        this.f = (x48) re3Var.g;
        this.g = (x48) re3Var.h;
        this.h = (x48) re3Var.i;
    }

    public static void a(re3 re3Var, Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlResourceParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth && xmlResourceParser.getName().equals("item")) {
                TypedArray typedArrayObtainAttributes = theme == null ? context.getResources().obtainAttributes(attributeSet, yt6.MaterialShape) : theme.obtainStyledAttributes(attributeSet, yt6.MaterialShape, 0, 0);
                as7 as7VarA = as7.a(context, typedArrayObtainAttributes.getResourceId(yt6.MaterialShape_shapeAppearance, 0), typedArrayObtainAttributes.getResourceId(yt6.MaterialShape_shapeAppearanceOverlay, 0)).a();
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr = new int[attributeCount];
                int i = 0;
                for (int i2 = 0; i2 < attributeCount; i2++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i2);
                    if (attributeNameResource != vp6.shapeAppearance && attributeNameResource != vp6.shapeAppearanceOverlay) {
                        int i3 = i + 1;
                        if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr[i] = attributeNameResource;
                        i = i3;
                    }
                }
                re3Var.a(StateSet.trimStateSet(iArr, i), as7VarA);
            }
        }
    }

    public static y48 b(Context context, TypedArray typedArray, int i) {
        XmlResourceParser xml;
        AttributeSet attributeSetAsAttributeSet;
        int next;
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId == 0 || !Objects.equals(context.getResources().getResourceTypeName(resourceId), "xml")) {
            return null;
        }
        re3 re3Var = new re3(1);
        re3Var.d();
        try {
            xml = context.getResources().getXml(resourceId);
            try {
                attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
            } catch (Throwable th) {
                if (xml != null) {
                    try {
                        xml.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
            re3Var.d();
        }
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        if (xml.getName().equals("selector")) {
            a(re3Var, context, xml, attributeSetAsAttributeSet, context.getTheme());
        }
        xml.close();
        if (re3Var.b == 0) {
            return null;
        }
        return new y48(re3Var);
    }

    public final as7 c() {
        as7 as7Var = this.b;
        x48 x48Var = this.h;
        x48 x48Var2 = this.g;
        x48 x48Var3 = this.f;
        x48 x48Var4 = this.e;
        if (x48Var4 == null && x48Var3 == null && x48Var2 == null && x48Var == null) {
            return as7Var;
        }
        yr7 yr7VarH = as7Var.h();
        if (x48Var4 != null) {
            yr7VarH.e = x48Var4.b;
        }
        if (x48Var3 != null) {
            yr7VarH.f = x48Var3.b;
        }
        if (x48Var2 != null) {
            yr7VarH.h = x48Var2.b;
        }
        if (x48Var != null) {
            yr7VarH.g = x48Var.b;
        }
        return yr7VarH.a();
    }

    public final boolean d() {
        x48 x48Var;
        x48 x48Var2;
        x48 x48Var3;
        x48 x48Var4;
        return this.a > 1 || ((x48Var = this.e) != null && x48Var.a > 1) || (((x48Var2 = this.f) != null && x48Var2.a > 1) || (((x48Var3 = this.g) != null && x48Var3.a > 1) || ((x48Var4 = this.h) != null && x48Var4.a > 1)));
    }
}
