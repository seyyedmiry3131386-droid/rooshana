package defpackage;

import de.greenrobot.event.EventBusException;
import de.greenrobot.event.ThreadMode;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ga8 {
    public static final HashMap b = new HashMap();
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    public final void a(ArrayList arrayList, HashMap map, StringBuilder sb, Method[] methodArr) {
        ThreadMode threadMode;
        ConcurrentHashMap concurrentHashMap = this.a;
        for (Method method : methodArr) {
            String name = method.getName();
            if (name.startsWith("onEvent")) {
                int modifiers = method.getModifiers();
                Class<?> declaringClass = method.getDeclaringClass();
                if ((modifiers & 1) != 0 && (modifiers & 5192) == 0) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    if (parameterTypes.length == 1) {
                        String strSubstring = name.substring(7);
                        if (strSubstring.length() == 0) {
                            threadMode = ThreadMode.a;
                        } else if (strSubstring.equals("MainThread")) {
                            threadMode = ThreadMode.b;
                        } else if (strSubstring.equals("BackgroundThread")) {
                            threadMode = ThreadMode.c;
                        } else if (strSubstring.equals("Async")) {
                            threadMode = ThreadMode.d;
                        } else {
                            if (!concurrentHashMap.containsKey(declaringClass)) {
                                throw new EventBusException("Illegal onEvent method, check for typos: " + method);
                            }
                            threadMode = null;
                        }
                        if (threadMode != null) {
                            Class<?> cls = parameterTypes[0];
                            sb.setLength(0);
                            sb.append(name);
                            sb.append('>');
                            sb.append(cls.getName());
                            String string = sb.toString();
                            Class cls2 = (Class) map.put(string, declaringClass);
                            if (cls2 == null || cls2.isAssignableFrom(declaringClass)) {
                                arrayList.add(new fa8(method, threadMode, cls));
                            } else {
                                map.put(string, cls2);
                            }
                        }
                    } else {
                        continue;
                    }
                } else if (!concurrentHashMap.containsKey(declaringClass)) {
                    t32 t32Var = t32.p;
                    Objects.toString(declaringClass);
                }
            }
        }
    }

    public final List b(Class cls) {
        List list;
        String name = cls.getName();
        HashMap map = b;
        synchronized (map) {
            list = (List) map.get(name);
        }
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        HashMap map2 = new HashMap();
        StringBuilder sb = new StringBuilder();
        for (Class superclass = cls; superclass != null; superclass = superclass.getSuperclass()) {
            String name2 = superclass.getName();
            if (name2.startsWith("java.") || name2.startsWith("javax.") || name2.startsWith("android.")) {
                break;
            }
            try {
                a(arrayList, map2, sb, superclass.getDeclaredMethods());
            } catch (Throwable th) {
                th.printStackTrace();
                Method[] methods = cls.getMethods();
                arrayList.clear();
                map2.clear();
                a(arrayList, map2, sb, methods);
            }
        }
        if (arrayList.isEmpty()) {
            throw new EventBusException(bl4.t(cls, "Subscriber ", " has no public methods called onEvent"));
        }
        HashMap map3 = b;
        synchronized (map3) {
            map3.put(name, arrayList);
        }
        return arrayList;
    }
}
