package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import android.util.Xml;
import io.sentry.android.core.t0;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class j58 {
    public SparseArray a = new SparseArray();
    public int b;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public j58(Context context, XmlResourceParser xmlResourceParser) {
        this.b = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), eu6.StateSet);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == eu6.StateSet_defaultState) {
                this.b = typedArrayObtainStyledAttributes.getResourceId(index, this.b);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        try {
            int eventType = xmlResourceParser.getEventType();
            h58 h58Var = null;
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlResourceParser.getName();
                    switch (name.hashCode()) {
                        case 80204913:
                            if (name.equals("State")) {
                                h58Var = new h58(context, xmlResourceParser);
                                this.a.put(h58Var.a, h58Var);
                            }
                            break;
                        case 1301459538:
                            name.equals("LayoutDescription");
                            break;
                        case 1382829617:
                            name.equals("StateSet");
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                i58 i58Var = new i58(context, xmlResourceParser);
                                if (h58Var != null) {
                                    h58Var.b.add(i58Var);
                                }
                            }
                            break;
                    }
                } else if (eventType != 3) {
                    continue;
                } else if ("StateSet".equals(xmlResourceParser.getName())) {
                    return;
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e) {
            t0.e("ConstraintLayoutStates", "Error parsing XML resource", e);
        } catch (XmlPullParserException e2) {
            t0.e("ConstraintLayoutStates", "Error parsing XML resource", e2);
        }
    }

    public int a(int i) {
        float f = -1;
        SparseArray sparseArray = this.a;
        int i2 = 0;
        if (-1 == i) {
            h58 h58Var = i == -1 ? (h58) sparseArray.valueAt(0) : (h58) sparseArray.get(-1);
            if (h58Var != null) {
                ArrayList arrayList = h58Var.b;
                while (true) {
                    if (i2 >= arrayList.size()) {
                        i2 = -1;
                        break;
                    }
                    if (((i58) arrayList.get(i2)).a(f, f)) {
                        break;
                    }
                    i2++;
                }
                if (-1 != i2) {
                    return i2 == -1 ? h58Var.c : ((i58) arrayList.get(i2)).e;
                }
            }
        } else {
            h58 h58Var2 = (h58) sparseArray.get(i);
            if (h58Var2 != null) {
                ArrayList arrayList2 = h58Var2.b;
                while (true) {
                    if (i2 >= arrayList2.size()) {
                        i2 = -1;
                        break;
                    }
                    if (((i58) arrayList2.get(i2)).a(f, f)) {
                        break;
                    }
                    i2++;
                }
                return i2 == -1 ? h58Var2.c : ((i58) arrayList2.get(i2)).e;
            }
        }
        return -1;
    }
}
