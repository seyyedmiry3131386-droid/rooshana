package org.pcap4j.util;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes4.dex */
public class PropertiesLoader {
    private static final Logger logger = LoggerFactory.getLogger((Class<?>) PropertiesLoader.class);
    private final Map<String, Object> cache;
    private final boolean caching;
    private final Properties prop;
    private final String resourceName;
    private final boolean systemPropertiesOverPropertiesFile;

    public PropertiesLoader(String str, boolean z, boolean z2) {
        Properties properties = new Properties();
        this.prop = properties;
        this.cache = new HashMap();
        this.resourceName = str;
        this.systemPropertiesOverPropertiesFile = z;
        this.caching = z2;
        InputStream resourceAsStream = getClass().getClassLoader().getResourceAsStream(str);
        if (resourceAsStream == null) {
            logger.warn("{} not found.", str);
            return;
        }
        try {
            properties.load(resourceAsStream);
        } catch (IOException e) {
            logger.error("Exception follows", (Throwable) e);
        }
    }

    public final void clearCache() {
        synchronized (this.cache) {
            this.cache.clear();
        }
    }

    public Boolean getBoolean(String str, Boolean bool) {
        Boolean boolValueOf;
        String property;
        synchronized (this.cache) {
            try {
                if (this.caching && this.cache.containsKey(str)) {
                    Boolean bool2 = (Boolean) this.cache.get(str);
                    logger.debug("[{}] Got {} from cache by {}", this.resourceName, bool2, str);
                    return bool2;
                }
                if (!this.systemPropertiesOverPropertiesFile || (property = System.getProperty(str)) == null) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(property);
                    logger.info("[System properties] Got \"{}\" which means {} by {}", property, boolValueOf, str);
                }
                if (boolValueOf == null) {
                    String property2 = this.prop.getProperty(str);
                    if (property2 != null) {
                        bool = Boolean.valueOf(property2);
                        logger.info("[{}] Got\"{}\" which means {} by {}", this.resourceName, property2, bool, str);
                    } else {
                        logger.info("[{}] Could not get value by {}, use default value: {}", this.resourceName, str, bool);
                    }
                } else {
                    bool = boolValueOf;
                }
                if (this.caching) {
                    this.cache.put(str, bool);
                }
                return bool;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public <T> Class<? extends T> getClass(String str, Class<? extends T> cls) {
        String property;
        synchronized (this.cache) {
            try {
                if (this.caching && this.cache.containsKey(str)) {
                    Class<? extends T> cls2 = (Class) this.cache.get(str);
                    logger.debug("[{}] Got {} from cache by {}", this.resourceName, cls2, str);
                    return cls2;
                }
                Class<?> cls3 = null;
                if (this.systemPropertiesOverPropertiesFile && (property = System.getProperty(str)) != null) {
                    try {
                        cls3 = Class.forName(property);
                        logger.info("[System properties] Got {} by {}", property, str);
                    } catch (ClassCastException unused) {
                        logger.error("[System properties] Got Invalid value: {} by {}, ignore it.", property, str);
                    } catch (ClassNotFoundException unused2) {
                        logger.error("[System properties] Got Invalid value: {} by {}, ignore it.", property, str);
                    }
                }
                if (cls3 == null) {
                    String property2 = this.prop.getProperty(str);
                    if (property2 != null) {
                        try {
                            Class<?> cls4 = Class.forName(property2);
                            logger.info("[{}] Got {} by {}", this.resourceName, property2, str);
                            cls = (Class<? extends T>) cls4;
                        } catch (ClassCastException unused3) {
                            logger.warn("[{}] {} is invalid for {}, use default value: {}", this.resourceName, property2, str, cls);
                        } catch (ClassNotFoundException unused4) {
                            logger.warn("[{}] {} is invalid for {}, use default value: {}", this.resourceName, property2, str, cls);
                        }
                    } else {
                        logger.info("[{}] Could not get value by {}, use default value: {}", this.resourceName, str, cls);
                    }
                } else {
                    cls = (Class<? extends T>) cls3;
                }
                if (this.caching) {
                    this.cache.put(str, cls);
                }
                return cls;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public InetAddress getInetAddress(String str, InetAddress inetAddress) {
        String property;
        synchronized (this.cache) {
            try {
                if (this.caching && this.cache.containsKey(str)) {
                    InetAddress inetAddress2 = (InetAddress) this.cache.get(str);
                    logger.debug("[{}] Got {} from cache by {}", this.resourceName, inetAddress2, str);
                    return inetAddress2;
                }
                InetAddress byName = null;
                if (this.systemPropertiesOverPropertiesFile && (property = System.getProperty(str)) != null) {
                    try {
                        byName = InetAddress.getByName(property);
                        logger.info("[System properties] Got \"{}\" which means {} by {}", property, byName, str);
                    } catch (UnknownHostException unused) {
                        logger.error("[System properties] Got Invalid value: {} by {}, ignore it.", property, str);
                    }
                }
                if (byName == null) {
                    String property2 = this.prop.getProperty(str);
                    if (property2 != null) {
                        try {
                            InetAddress byName2 = InetAddress.getByName(property2);
                            logger.info("[{}] Got\"{}\" which means {} by {}", this.resourceName, property2, byName2, str);
                            inetAddress = byName2;
                        } catch (UnknownHostException unused2) {
                            logger.warn("[{}] {} is invalid for {}, use default value: {}", this.resourceName, property2, str, inetAddress);
                        }
                    } else {
                        logger.info("[{}] Could not get value by {}, use default value: {}", this.resourceName, str, inetAddress);
                    }
                } else {
                    inetAddress = byName;
                }
                if (this.caching) {
                    this.cache.put(str, inetAddress);
                }
                return inetAddress;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int[] getIntArray(String str, int[] iArr) {
        String property;
        synchronized (this.cache) {
            try {
                if (this.caching && this.cache.containsKey(str)) {
                    int[] iArr2 = (int[]) this.cache.get(str);
                    logger.debug("[{}] Got {} from cache by {}", this.resourceName, Arrays.toString(iArr2), str);
                    return (int[]) iArr2.clone();
                }
                int[] iArr3 = null;
                if (this.systemPropertiesOverPropertiesFile && (property = System.getProperty(str)) != null) {
                    try {
                        String[] strArrSplit = property.split(",");
                        iArr3 = new int[strArrSplit.length];
                        for (int i = 0; i < strArrSplit.length; i++) {
                            iArr3[i] = Integer.parseInt(strArrSplit[i]);
                        }
                        logger.info("[System properties] Got \"{}\" which means {} by {}", property, Arrays.toString(iArr3), str);
                    } catch (NumberFormatException unused) {
                        logger.error("[System properties] Got Invalid value: {} by {}, ignore it.", property, str);
                    }
                }
                if (iArr3 == null) {
                    String property2 = this.prop.getProperty(str);
                    if (property2 != null) {
                        try {
                            String[] strArrSplit2 = property2.split(",");
                            int[] iArr4 = new int[strArrSplit2.length];
                            for (int i2 = 0; i2 < strArrSplit2.length; i2++) {
                                iArr4[i2] = Integer.parseInt(strArrSplit2[i2]);
                            }
                            logger.info("[{}] Got\"{}\" which means {} by {}", this.resourceName, property2, Arrays.toString(iArr4), str);
                            iArr = iArr4;
                        } catch (NumberFormatException unused2) {
                            logger.warn("[{}] {} is invalid for {}, use default value: {}", this.resourceName, property2, str, Arrays.toString(iArr));
                        }
                    } else {
                        logger.info("[{}] Could not get value by {}, use default value: {}", this.resourceName, str, Arrays.toString(iArr));
                    }
                } else {
                    iArr = iArr3;
                }
                if (this.caching) {
                    this.cache.put(str, iArr);
                }
                return iArr;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Integer getInteger(String str, Integer num) {
        synchronized (this.cache) {
            try {
                if (this.caching && this.cache.containsKey(str)) {
                    Integer num2 = (Integer) this.cache.get(str);
                    logger.debug("[{}] Got {} from cache by {}", this.resourceName, num2, str);
                    return num2;
                }
                Integer integer = this.systemPropertiesOverPropertiesFile ? Integer.getInteger(str) : null;
                if (integer != null) {
                    logger.info("[System properties] Got {} by {}", integer, str);
                    num = integer;
                } else {
                    String property = this.prop.getProperty(str);
                    if (property != null) {
                        try {
                            Integer numDecode = Integer.decode(property);
                            logger.info("[{}] Got {} by {}", this.resourceName, numDecode, str);
                            num = numDecode;
                        } catch (NumberFormatException unused) {
                            logger.warn("[{}] {} is invalid for {}, use default value: {}", this.resourceName, property, str, num);
                        }
                    } else {
                        logger.info("[{}] Could not get value by {}, use default value: {}", this.resourceName, str, num);
                    }
                }
                if (this.caching) {
                    this.cache.put(str, num);
                }
                return num;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Properties getProp() {
        Properties properties = new Properties();
        properties.putAll(this.prop);
        return properties;
    }

    public final String getResourceName() {
        return this.resourceName;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0074 A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:4:0x0003, B:6:0x000b, B:8:0x0013, B:9:0x002c, B:13:0x0030, B:15:0x0034, B:18:0x003c, B:24:0x0070, B:26:0x0074, B:27:0x0079, B:20:0x0045, B:22:0x004d, B:23:0x005f), top: B:31:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String getString(java.lang.String r9, java.lang.String r10) {
        /*
            r8 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r8.cache
            monitor-enter(r0)
            boolean r1 = r8.caching     // Catch: java.lang.Throwable -> L2e
            r2 = 2
            r3 = 1
            r4 = 0
            r5 = 3
            if (r1 == 0) goto L30
            java.util.Map<java.lang.String, java.lang.Object> r1 = r8.cache     // Catch: java.lang.Throwable -> L2e
            boolean r1 = r1.containsKey(r9)     // Catch: java.lang.Throwable -> L2e
            if (r1 == 0) goto L30
            java.util.Map<java.lang.String, java.lang.Object> r10 = r8.cache     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r10 = r10.get(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Throwable -> L2e
            org.slf4j.Logger r1 = org.pcap4j.util.PropertiesLoader.logger     // Catch: java.lang.Throwable -> L2e
            java.lang.String r6 = "[{}] Got {} from cache by {}"
            java.lang.String r7 = r8.resourceName     // Catch: java.lang.Throwable -> L2e
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L2e
            r5[r4] = r7     // Catch: java.lang.Throwable -> L2e
            r5[r3] = r10     // Catch: java.lang.Throwable -> L2e
            r5[r2] = r9     // Catch: java.lang.Throwable -> L2e
            r1.debug(r6, r5)     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2e
            return r10
        L2e:
            r9 = move-exception
            goto L7b
        L30:
            boolean r1 = r8.systemPropertiesOverPropertiesFile     // Catch: java.lang.Throwable -> L2e
            if (r1 == 0) goto L39
            java.lang.String r1 = java.lang.System.getProperty(r9)     // Catch: java.lang.Throwable -> L2e
            goto L3a
        L39:
            r1 = 0
        L3a:
            if (r1 == 0) goto L45
            org.slf4j.Logger r10 = org.pcap4j.util.PropertiesLoader.logger     // Catch: java.lang.Throwable -> L2e
            java.lang.String r2 = "[System properties] Got {} by {}"
            r10.info(r2, r1, r9)     // Catch: java.lang.Throwable -> L2e
        L43:
            r10 = r1
            goto L70
        L45:
            java.util.Properties r1 = r8.prop     // Catch: java.lang.Throwable -> L2e
            java.lang.String r1 = r1.getProperty(r9)     // Catch: java.lang.Throwable -> L2e
            if (r1 == 0) goto L5f
            org.slf4j.Logger r10 = org.pcap4j.util.PropertiesLoader.logger     // Catch: java.lang.Throwable -> L2e
            java.lang.String r6 = "[{}] Got {} by {}"
            java.lang.String r7 = r8.resourceName     // Catch: java.lang.Throwable -> L2e
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L2e
            r5[r4] = r7     // Catch: java.lang.Throwable -> L2e
            r5[r3] = r1     // Catch: java.lang.Throwable -> L2e
            r5[r2] = r9     // Catch: java.lang.Throwable -> L2e
            r10.info(r6, r5)     // Catch: java.lang.Throwable -> L2e
            goto L43
        L5f:
            org.slf4j.Logger r1 = org.pcap4j.util.PropertiesLoader.logger     // Catch: java.lang.Throwable -> L2e
            java.lang.String r6 = "[{}] Could not get value by {}, use default value: {}"
            java.lang.String r7 = r8.resourceName     // Catch: java.lang.Throwable -> L2e
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L2e
            r5[r4] = r7     // Catch: java.lang.Throwable -> L2e
            r5[r3] = r9     // Catch: java.lang.Throwable -> L2e
            r5[r2] = r10     // Catch: java.lang.Throwable -> L2e
            r1.info(r6, r5)     // Catch: java.lang.Throwable -> L2e
        L70:
            boolean r1 = r8.caching     // Catch: java.lang.Throwable -> L2e
            if (r1 == 0) goto L79
            java.util.Map<java.lang.String, java.lang.Object> r1 = r8.cache     // Catch: java.lang.Throwable -> L2e
            r1.put(r9, r10)     // Catch: java.lang.Throwable -> L2e
        L79:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2e
            return r10
        L7b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2e
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: org.pcap4j.util.PropertiesLoader.getString(java.lang.String, java.lang.String):java.lang.String");
    }

    public final boolean isCaching() {
        return this.caching;
    }

    public final boolean isSystemPropertiesOverPropertiesFile() {
        return this.systemPropertiesOverPropertiesFile;
    }
}
