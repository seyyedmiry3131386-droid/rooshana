package defpackage;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintLayout;
import io.sentry.android.core.t0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class ey3 {
    public static final HashMap b;
    public HashMap a = new HashMap();

    static {
        HashMap map = new HashMap();
        b = map;
        try {
            map.put("KeyAttribute", vx3.class.getConstructor(null));
            map.put("KeyPosition", ny3.class.getConstructor(null));
            map.put("KeyCycle", yx3.class.getConstructor(null));
            map.put("KeyTimeCycle", py3.class.getConstructor(null));
            map.put("KeyTrigger", ry3.class.getConstructor(null));
        } catch (NoSuchMethodException e) {
            t0.e("KeyFrames", "unable to load", e);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public ey3(Context context, XmlResourceParser xmlResourceParser) {
        int eventType;
        rx3 rx3Var;
        HashMap map;
        HashMap map2;
        rx3 py3Var;
        try {
            eventType = xmlResourceParser.getEventType();
            rx3Var = null;
        } catch (IOException e) {
            t0.e("KeyFrames", "Error parsing XML resource", e);
            return;
        } catch (XmlPullParserException e2) {
            t0.e("KeyFrames", "Error parsing XML resource", e2);
            return;
        }
        while (eventType != 1) {
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (b.containsKey(name)) {
                    switch (name.hashCode()) {
                        case -300573030:
                            if (!name.equals("KeyTimeCycle")) {
                                throw new NullPointerException("Key " + name + " not found");
                            }
                            py3Var = new py3();
                            py3Var.e(context, Xml.asAttributeSet(xmlResourceParser));
                            b(py3Var);
                            rx3Var = py3Var;
                            break;
                            break;
                        case -298435811:
                            if (!name.equals("KeyAttribute")) {
                                throw new NullPointerException("Key " + name + " not found");
                            }
                            py3Var = new vx3();
                            py3Var.e(context, Xml.asAttributeSet(xmlResourceParser));
                            b(py3Var);
                            rx3Var = py3Var;
                            break;
                            break;
                        case 540053991:
                            if (!name.equals("KeyCycle")) {
                                throw new NullPointerException("Key " + name + " not found");
                            }
                            py3Var = new yx3();
                            py3Var.e(context, Xml.asAttributeSet(xmlResourceParser));
                            b(py3Var);
                            rx3Var = py3Var;
                            break;
                            break;
                        case 1153397896:
                            if (!name.equals("KeyPosition")) {
                                throw new NullPointerException("Key " + name + " not found");
                            }
                            py3Var = new ny3();
                            py3Var.e(context, Xml.asAttributeSet(xmlResourceParser));
                            b(py3Var);
                            rx3Var = py3Var;
                            break;
                            break;
                        case 1308496505:
                            if (!name.equals("KeyTrigger")) {
                                throw new NullPointerException("Key " + name + " not found");
                            }
                            py3Var = new ry3();
                            py3Var.e(context, Xml.asAttributeSet(xmlResourceParser));
                            b(py3Var);
                            rx3Var = py3Var;
                            break;
                            break;
                        default:
                            throw new NullPointerException("Key " + name + " not found");
                    }
                    return;
                }
                if (name.equalsIgnoreCase("CustomAttribute")) {
                    if (rx3Var != null && (map2 = rx3Var.d) != null) {
                        w21.d(context, xmlResourceParser, map2);
                    }
                } else if (name.equalsIgnoreCase("CustomMethod") && rx3Var != null && (map = rx3Var.d) != null) {
                    w21.d(context, xmlResourceParser, map);
                }
            } else if (eventType == 3 && "KeyFrameSet".equals(xmlResourceParser.getName())) {
                return;
            }
            eventType = xmlResourceParser.next();
        }
    }

    public final void a(ly4 ly4Var) {
        HashMap map = this.a;
        ArrayList arrayList = (ArrayList) map.get(Integer.valueOf(ly4Var.c));
        if (arrayList != null) {
            ly4Var.w.addAll(arrayList);
        }
        ArrayList<rx3> arrayList2 = (ArrayList) map.get(-1);
        if (arrayList2 != null) {
            for (rx3 rx3Var : arrayList2) {
                String str = ((ConstraintLayout.LayoutParams) ly4Var.b.getLayoutParams()).Y;
                String str2 = rx3Var.c;
                if ((str2 == null || str == null) ? false : str.matches(str2)) {
                    ly4Var.a(rx3Var);
                }
            }
        }
    }

    public final void b(rx3 rx3Var) {
        HashMap map = this.a;
        if (!map.containsKey(Integer.valueOf(rx3Var.b))) {
            map.put(Integer.valueOf(rx3Var.b), new ArrayList());
        }
        ArrayList arrayList = (ArrayList) map.get(Integer.valueOf(rx3Var.b));
        if (arrayList != null) {
            arrayList.add(rx3Var);
        }
    }
}
