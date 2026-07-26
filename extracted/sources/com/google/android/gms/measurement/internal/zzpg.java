package com.google.android.gms.measurement.internal;

import android.app.BroadcastOptions;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.measurement.b0;
import com.google.android.gms.internal.measurement.d0;
import com.google.android.gms.internal.measurement.e0;
import com.google.android.gms.internal.measurement.j0;
import com.google.android.gms.internal.measurement.m;
import com.google.android.gms.internal.measurement.s;
import com.google.android.gms.internal.measurement.z;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.j256.ormlite.field.FieldType;
import defpackage.b21;
import defpackage.eq;
import defpackage.lq9;
import defpackage.nq9;
import defpackage.pq9;
import defpackage.rq4;
import defpackage.sg9;
import defpackage.tu9;
import defpackage.uu9;
import defpackage.wq9;
import defpackage.wv;
import defpackage.xp9;
import defpackage.xt0;
import defpackage.yv9;
import j$.util.DesugarCollections;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class zzpg implements zzjg {
    private static volatile zzpg zzb;
    private List zzA;
    private long zzB;
    private final Map zzC;
    private final Map zzD;
    private final Map zzE;
    private zzlu zzG;
    private String zzH;
    private zzay zzI;
    private long zzJ;
    long zza;
    private final zzht zzc;
    private final zzgz zzd;
    private zzav zze;
    private zzhb zzf;
    private zzok zzg;
    private zzad zzh;
    private final zzpk zzi;
    private zzlp zzj;
    private zznn zzk;
    private final zzou zzl;
    private zzhk zzm;
    private final zzic zzn;
    private boolean zzp;
    private List zzq;
    private int zzs;
    private int zzt;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private FileLock zzx;
    private FileChannel zzy;
    private List zzz;
    private final AtomicBoolean zzo = new AtomicBoolean(false);
    private final Deque zzr = new LinkedList();
    private final Map zzF = new HashMap();
    private final zzpo zzK = new zzpb(this);

    public zzpg(zzph zzphVar, zzic zzicVar) {
        rq4.n(zzphVar);
        this.zzn = zzic.zzy(zzphVar.zza, null, null);
        this.zzB = -1L;
        this.zzl = new zzou(this);
        zzpk zzpkVar = new zzpk(this);
        zzpkVar.zzax();
        this.zzi = zzpkVar;
        zzgz zzgzVar = new zzgz(this);
        zzgzVar.zzax();
        this.zzd = zzgzVar;
        zzht zzhtVar = new zzht(this);
        zzhtVar.zzax();
        this.zzc = zzhtVar;
        this.zzC = new HashMap();
        this.zzD = new HashMap();
        this.zzE = new HashMap();
        zzaW().zzj(new zzov(this, zzphVar));
    }

    public static zzpg zza(Context context) {
        rq4.n(context);
        rq4.n(context.getApplicationContext());
        if (zzb == null) {
            synchronized (zzpg.class) {
                try {
                    if (zzb == null) {
                        zzb = new zzpg(new zzph(context), null);
                    }
                } finally {
                }
            }
        }
        return zzb;
    }

    public static final void zzaA(lq9 lq9Var, int i, String str) {
        List listH = lq9Var.h();
        for (int i2 = 0; i2 < listH.size(); i2++) {
            if ("_err".equals(((b0) listH.get(i2)).q())) {
                return;
            }
        }
        nq9 nq9VarB = b0.B();
        nq9VarB.h("_err");
        nq9VarB.j(i);
        b0 b0Var = (b0) nq9VarB.e();
        nq9 nq9VarB2 = b0.B();
        nq9VarB2.h("_ev");
        nq9VarB2.i(str);
        b0 b0Var2 = (b0) nq9VarB2.e();
        lq9Var.k(b0Var);
        lq9Var.k(b0Var2);
    }

    public static final void zzaB(lq9 lq9Var, String str) {
        List listH = lq9Var.h();
        for (int i = 0; i < listH.size(); i++) {
            if (str.equals(((b0) listH.get(i)).q())) {
                lq9Var.m(i);
                return;
            }
        }
    }

    private final int zzaC(String str, zzan zzanVar) {
        zzjk zzjkVar;
        zzji zzjiVarZzA;
        zzht zzhtVar = this.zzc;
        if (zzhtVar.zzx(str) == null) {
            zzanVar.zzc(zzjk.AD_PERSONALIZATION, zzam.FAILSAFE);
            return 1;
        }
        zzh zzhVarZzu = zzj().zzu(str);
        if (zzhVarZzu != null && zze.zzc(zzhVarZzu.zzaH()).zza() == zzji.POLICY && (zzjiVarZzA = zzhtVar.zzA(str, (zzjkVar = zzjk.AD_PERSONALIZATION))) != zzji.UNINITIALIZED) {
            zzanVar.zzc(zzjkVar, zzam.REMOTE_ENFORCED_DEFAULT);
            return zzjiVarZzA == zzji.GRANTED ? 0 : 1;
        }
        zzjk zzjkVar2 = zzjk.AD_PERSONALIZATION;
        zzanVar.zzc(zzjkVar2, zzam.REMOTE_DEFAULT);
        return zzhtVar.zzv(str, zzjkVar2) ? 0 : 1;
    }

    private final Map zzaD(z zVar) {
        HashMap map = new HashMap();
        zzp();
        for (Map.Entry entry : zzpk.zzH(zVar, "gad_").entrySet()) {
            map.put((String) entry.getKey(), String.valueOf(entry.getValue()));
        }
        return map;
    }

    private final zzay zzaE() {
        if (this.zzI == null) {
            this.zzI = new zzoy(this, this.zzn);
        }
        return this.zzI;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzaF, reason: merged with bridge method [inline-methods] */
    public final void zzav() {
        zzaW().zzg();
        if (this.zzr.isEmpty() || zzaE().zzc()) {
            return;
        }
        ((eq) zzaZ()).getClass();
        long jMax = Math.max(0L, ((long) ((Integer) zzfy.zzaB.zzb(null)).intValue()) - (SystemClock.elapsedRealtime() - this.zzJ));
        zzaV().zzk().zzb("Scheduling notify next app runnable, delay in ms", Long.valueOf(jMax));
        zzaE().zzb(jMax);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(40:8|(5:9|10|(4:12|13|(4:15|(1:22)|25|488)(18:26|27|(2:35|(3:37|(1:44)(1:43)|45)(0))(1:34)|46|(2:48|(3:50|(4:53|(1:493)(2:59|490)|60|51)|489))|61|62|(5:64|65|(3:68|(0)|(7:117|(5:121|(2:123|504)(2:124|(2:126|503)(1:505))|127|118|119)|502|128|(2:131|(3:137|(1:139)(2:140|(3:142|(3:145|(1:147)(1:521)|143)|520))|148)(2:135|136))(1:130)|149|(2:151|(6:(2:156|(6:158|159|193|(9:195|(4:198|(2:211|(2:213|507)(1:509))(5:202|(5:205|(2:208|206)|511|209|203)|510|210|508)|214|196)|506|215|(4:218|(3:513|220|516)(1:515)|514|216)|512|221|(2:224|222)|517)(1:225)|226|487))|160|193|(0)(0)|226|487)(7:161|162|192|193|(0)(0)|226|487))(2:163|(8:165|(6:(2:170|(6:172|159|193|(0)(0)|226|487))|173|193|(0)(0)|226|487)|162|192|193|(0)(0)|226|487)(7:174|(2:185|(2:186|(2:188|(2:519|190)(1:191))(1:518)))(0)|192|193|(0)(0)|226|487)))(3:136|149|(0)(0)))|71|(0)(0))(1:72)|70|(3:73|74|(3:76|(2:78|496)(2:79|(2:81|495)(1:497))|82)(1:494))|83|(1:87)(1:86)|(1:89)|90|(1:92)(1:93)|94|(2:97|(4:99|(4:102|(2:104|500)(2:105|(2:107|499)(1:501))|108|100)|498|(1:(1:114)(1:115))(1:(1:111)(2:112|(0)(0)))))|(0)(0))|227)(1:486)|475|476)|228|(3:230|(2:232|(2:234|524)(2:235|(1:525)(3:237|(1:239)(1:240)|(1:527)(2:244|523))))(0)|245)|522|246|(3:247|248|(1:528)(2:250|(2:529|252)(1:530)))|253|(1:255)(2:256|(1:258))|259|(1:261)(1:262)|263|(1:265)(1:266)|267|(6:270|(1:272)|273|(2:275|532)(1:533)|276|268)|531|277|(2:282|(1:286))(1:281)|287|(1:289)|290|(1:292)|293|(1:301)|302|(10:478|304|(7:307|308|(5:310|(2:312|(1:314))|(1:331)(5:318|(1:322)|324|(1:329)(1:328)|330)|332|333)(7:335|336|(6:482|338|339|344|(6:346|(3:349|(3:542|351|(3:353|359|(1:361)(7:362|(6:364|(1:366)|369|(1:371)(1:373)|372|(4:375|(1:383)|384|540)(4:385|(3:387|(1:389)|390)(5:391|(1:393)(1:394)|395|(3:397|(1:399)|400)(2:402|(1:404))|401)|405|538))(1:368)|367|369|(0)(0)|372|(0)(0)))(2:354|(0)(0)))(1:357)|347)|541|358|359|(0)(0))(3:358|359|(0)(0))|406)(1:343)|342|344|(0)(0)|406)|334|539|406|305)|537|407|(1:409)|410|(2:413|411)|543|414)(1:415)|416|(1:418)(13:420|(9:422|(1:424)(1:425)|426|(1:428)(1:429)|430|(1:432)(1:433)|434|(1:436)(1:437)|438)|439|(4:441|442|(2:450|(1:452)(1:453))(1:447)|454)(1:455)|456|(3:(2:460|535)(1:536)|461|457)|534|462|(1:464)|465|480|466|470)|419|439|(0)(0)|456|(1:457)|534|462|(0)|465|480|466|470) */
    /* JADX WARN: Code restructure failed: missing block: B:468:0x0ec0, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:469:0x0ec1, code lost:
    
        r3.zzu.zzaV().zzb().zzc("Failed to remove unused event metadata. appId", com.google.android.gms.measurement.internal.zzgu.zzl(r1), r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03d2 A[Catch: all -> 0x00fd, TryCatch #4 {all -> 0x00fd, blocks: (B:3:0x0017, B:5:0x002e, B:8:0x0038, B:9:0x0055, B:12:0x0067, B:15:0x0091, B:17:0x00c6, B:20:0x00d7, B:22:0x00e1, B:227:0x0700, B:26:0x010e, B:29:0x0120, B:31:0x0126, B:46:0x016a, B:48:0x0178, B:51:0x0198, B:53:0x019e, B:55:0x01ae, B:57:0x01bc, B:59:0x01cc, B:60:0x01d9, B:61:0x01dc, B:64:0x01f2, B:73:0x0225, B:76:0x022f, B:78:0x023d, B:82:0x0292, B:79:0x0261, B:81:0x0271, B:86:0x029f, B:89:0x02d4, B:90:0x02fe, B:92:0x0337, B:94:0x033d, B:97:0x0349, B:99:0x0380, B:100:0x039b, B:102:0x03a1, B:104:0x03af, B:108:0x03c4, B:105:0x03b8, B:111:0x03cb, B:114:0x03d2, B:115:0x03f1, B:117:0x040a, B:118:0x0416, B:121:0x0420, B:127:0x0443, B:124:0x0432, B:149:0x04c1, B:151:0x04cd, B:154:0x04de, B:156:0x04ef, B:158:0x04fb, B:193:0x05c7, B:195:0x05cd, B:196:0x05d9, B:198:0x05df, B:200:0x05ef, B:202:0x05f9, B:203:0x060a, B:205:0x0610, B:206:0x062b, B:208:0x0631, B:209:0x064f, B:210:0x065c, B:214:0x0681, B:211:0x0662, B:213:0x066e, B:215:0x0688, B:216:0x06a5, B:218:0x06ab, B:220:0x06be, B:221:0x06cb, B:222:0x06cf, B:224:0x06d5, B:226:0x06e1, B:163:0x0518, B:165:0x0526, B:168:0x0539, B:170:0x054b, B:172:0x0557, B:174:0x0567, B:176:0x0576, B:179:0x0582, B:181:0x058c, B:183:0x0596, B:186:0x05a1, B:188:0x05a7, B:190:0x05b7, B:191:0x05c2, B:131:0x044b, B:133:0x0457, B:135:0x0463, B:148:0x04a9, B:140:0x0481, B:143:0x0493, B:145:0x0499, B:147:0x04a3, B:35:0x0132, B:37:0x013f, B:39:0x014b, B:41:0x0151, B:45:0x015c, B:230:0x071a, B:232:0x072c, B:234:0x0735, B:245:0x0765, B:235:0x073d, B:237:0x0746, B:239:0x074c, B:242:0x0758, B:244:0x0760, B:246:0x0768, B:247:0x0774, B:250:0x077c, B:252:0x078e, B:253:0x0799, B:255:0x07a1, B:259:0x07ce, B:261:0x07e8, B:263:0x07fd, B:265:0x0817, B:267:0x082c, B:268:0x0848, B:270:0x084e, B:272:0x0866, B:273:0x0874, B:275:0x0884, B:276:0x0892, B:277:0x0895, B:279:0x08d7, B:281:0x08dd, B:287:0x0904, B:289:0x090c, B:290:0x092a, B:292:0x0930, B:293:0x0944, B:295:0x0959, B:297:0x0969, B:299:0x0979, B:301:0x0981, B:302:0x0984, B:310:0x0a1c, B:312:0x0a35, B:314:0x0a48, B:316:0x0a4d, B:318:0x0a51, B:320:0x0a55, B:322:0x0a5f, B:324:0x0a68, B:326:0x0a6c, B:328:0x0a72, B:330:0x0a7d, B:332:0x0a8b, B:338:0x0ab3, B:341:0x0abb, B:282:0x08eb, B:284:0x08f1, B:286:0x08f7, B:266:0x0829, B:262:0x07fa, B:256:0x07a7, B:258:0x07ad), top: B:484:0x0017, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x03f1 A[Catch: all -> 0x00fd, TryCatch #4 {all -> 0x00fd, blocks: (B:3:0x0017, B:5:0x002e, B:8:0x0038, B:9:0x0055, B:12:0x0067, B:15:0x0091, B:17:0x00c6, B:20:0x00d7, B:22:0x00e1, B:227:0x0700, B:26:0x010e, B:29:0x0120, B:31:0x0126, B:46:0x016a, B:48:0x0178, B:51:0x0198, B:53:0x019e, B:55:0x01ae, B:57:0x01bc, B:59:0x01cc, B:60:0x01d9, B:61:0x01dc, B:64:0x01f2, B:73:0x0225, B:76:0x022f, B:78:0x023d, B:82:0x0292, B:79:0x0261, B:81:0x0271, B:86:0x029f, B:89:0x02d4, B:90:0x02fe, B:92:0x0337, B:94:0x033d, B:97:0x0349, B:99:0x0380, B:100:0x039b, B:102:0x03a1, B:104:0x03af, B:108:0x03c4, B:105:0x03b8, B:111:0x03cb, B:114:0x03d2, B:115:0x03f1, B:117:0x040a, B:118:0x0416, B:121:0x0420, B:127:0x0443, B:124:0x0432, B:149:0x04c1, B:151:0x04cd, B:154:0x04de, B:156:0x04ef, B:158:0x04fb, B:193:0x05c7, B:195:0x05cd, B:196:0x05d9, B:198:0x05df, B:200:0x05ef, B:202:0x05f9, B:203:0x060a, B:205:0x0610, B:206:0x062b, B:208:0x0631, B:209:0x064f, B:210:0x065c, B:214:0x0681, B:211:0x0662, B:213:0x066e, B:215:0x0688, B:216:0x06a5, B:218:0x06ab, B:220:0x06be, B:221:0x06cb, B:222:0x06cf, B:224:0x06d5, B:226:0x06e1, B:163:0x0518, B:165:0x0526, B:168:0x0539, B:170:0x054b, B:172:0x0557, B:174:0x0567, B:176:0x0576, B:179:0x0582, B:181:0x058c, B:183:0x0596, B:186:0x05a1, B:188:0x05a7, B:190:0x05b7, B:191:0x05c2, B:131:0x044b, B:133:0x0457, B:135:0x0463, B:148:0x04a9, B:140:0x0481, B:143:0x0493, B:145:0x0499, B:147:0x04a3, B:35:0x0132, B:37:0x013f, B:39:0x014b, B:41:0x0151, B:45:0x015c, B:230:0x071a, B:232:0x072c, B:234:0x0735, B:245:0x0765, B:235:0x073d, B:237:0x0746, B:239:0x074c, B:242:0x0758, B:244:0x0760, B:246:0x0768, B:247:0x0774, B:250:0x077c, B:252:0x078e, B:253:0x0799, B:255:0x07a1, B:259:0x07ce, B:261:0x07e8, B:263:0x07fd, B:265:0x0817, B:267:0x082c, B:268:0x0848, B:270:0x084e, B:272:0x0866, B:273:0x0874, B:275:0x0884, B:276:0x0892, B:277:0x0895, B:279:0x08d7, B:281:0x08dd, B:287:0x0904, B:289:0x090c, B:290:0x092a, B:292:0x0930, B:293:0x0944, B:295:0x0959, B:297:0x0969, B:299:0x0979, B:301:0x0981, B:302:0x0984, B:310:0x0a1c, B:312:0x0a35, B:314:0x0a48, B:316:0x0a4d, B:318:0x0a51, B:320:0x0a55, B:322:0x0a5f, B:324:0x0a68, B:326:0x0a6c, B:328:0x0a72, B:330:0x0a7d, B:332:0x0a8b, B:338:0x0ab3, B:341:0x0abb, B:282:0x08eb, B:284:0x08f1, B:286:0x08f7, B:266:0x0829, B:262:0x07fa, B:256:0x07a7, B:258:0x07ad), top: B:484:0x0017, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x040a A[Catch: all -> 0x00fd, TryCatch #4 {all -> 0x00fd, blocks: (B:3:0x0017, B:5:0x002e, B:8:0x0038, B:9:0x0055, B:12:0x0067, B:15:0x0091, B:17:0x00c6, B:20:0x00d7, B:22:0x00e1, B:227:0x0700, B:26:0x010e, B:29:0x0120, B:31:0x0126, B:46:0x016a, B:48:0x0178, B:51:0x0198, B:53:0x019e, B:55:0x01ae, B:57:0x01bc, B:59:0x01cc, B:60:0x01d9, B:61:0x01dc, B:64:0x01f2, B:73:0x0225, B:76:0x022f, B:78:0x023d, B:82:0x0292, B:79:0x0261, B:81:0x0271, B:86:0x029f, B:89:0x02d4, B:90:0x02fe, B:92:0x0337, B:94:0x033d, B:97:0x0349, B:99:0x0380, B:100:0x039b, B:102:0x03a1, B:104:0x03af, B:108:0x03c4, B:105:0x03b8, B:111:0x03cb, B:114:0x03d2, B:115:0x03f1, B:117:0x040a, B:118:0x0416, B:121:0x0420, B:127:0x0443, B:124:0x0432, B:149:0x04c1, B:151:0x04cd, B:154:0x04de, B:156:0x04ef, B:158:0x04fb, B:193:0x05c7, B:195:0x05cd, B:196:0x05d9, B:198:0x05df, B:200:0x05ef, B:202:0x05f9, B:203:0x060a, B:205:0x0610, B:206:0x062b, B:208:0x0631, B:209:0x064f, B:210:0x065c, B:214:0x0681, B:211:0x0662, B:213:0x066e, B:215:0x0688, B:216:0x06a5, B:218:0x06ab, B:220:0x06be, B:221:0x06cb, B:222:0x06cf, B:224:0x06d5, B:226:0x06e1, B:163:0x0518, B:165:0x0526, B:168:0x0539, B:170:0x054b, B:172:0x0557, B:174:0x0567, B:176:0x0576, B:179:0x0582, B:181:0x058c, B:183:0x0596, B:186:0x05a1, B:188:0x05a7, B:190:0x05b7, B:191:0x05c2, B:131:0x044b, B:133:0x0457, B:135:0x0463, B:148:0x04a9, B:140:0x0481, B:143:0x0493, B:145:0x0499, B:147:0x04a3, B:35:0x0132, B:37:0x013f, B:39:0x014b, B:41:0x0151, B:45:0x015c, B:230:0x071a, B:232:0x072c, B:234:0x0735, B:245:0x0765, B:235:0x073d, B:237:0x0746, B:239:0x074c, B:242:0x0758, B:244:0x0760, B:246:0x0768, B:247:0x0774, B:250:0x077c, B:252:0x078e, B:253:0x0799, B:255:0x07a1, B:259:0x07ce, B:261:0x07e8, B:263:0x07fd, B:265:0x0817, B:267:0x082c, B:268:0x0848, B:270:0x084e, B:272:0x0866, B:273:0x0874, B:275:0x0884, B:276:0x0892, B:277:0x0895, B:279:0x08d7, B:281:0x08dd, B:287:0x0904, B:289:0x090c, B:290:0x092a, B:292:0x0930, B:293:0x0944, B:295:0x0959, B:297:0x0969, B:299:0x0979, B:301:0x0981, B:302:0x0984, B:310:0x0a1c, B:312:0x0a35, B:314:0x0a48, B:316:0x0a4d, B:318:0x0a51, B:320:0x0a55, B:322:0x0a5f, B:324:0x0a68, B:326:0x0a6c, B:328:0x0a72, B:330:0x0a7d, B:332:0x0a8b, B:338:0x0ab3, B:341:0x0abb, B:282:0x08eb, B:284:0x08f1, B:286:0x08f7, B:266:0x0829, B:262:0x07fa, B:256:0x07a7, B:258:0x07ad), top: B:484:0x0017, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x04cd A[Catch: all -> 0x00fd, TryCatch #4 {all -> 0x00fd, blocks: (B:3:0x0017, B:5:0x002e, B:8:0x0038, B:9:0x0055, B:12:0x0067, B:15:0x0091, B:17:0x00c6, B:20:0x00d7, B:22:0x00e1, B:227:0x0700, B:26:0x010e, B:29:0x0120, B:31:0x0126, B:46:0x016a, B:48:0x0178, B:51:0x0198, B:53:0x019e, B:55:0x01ae, B:57:0x01bc, B:59:0x01cc, B:60:0x01d9, B:61:0x01dc, B:64:0x01f2, B:73:0x0225, B:76:0x022f, B:78:0x023d, B:82:0x0292, B:79:0x0261, B:81:0x0271, B:86:0x029f, B:89:0x02d4, B:90:0x02fe, B:92:0x0337, B:94:0x033d, B:97:0x0349, B:99:0x0380, B:100:0x039b, B:102:0x03a1, B:104:0x03af, B:108:0x03c4, B:105:0x03b8, B:111:0x03cb, B:114:0x03d2, B:115:0x03f1, B:117:0x040a, B:118:0x0416, B:121:0x0420, B:127:0x0443, B:124:0x0432, B:149:0x04c1, B:151:0x04cd, B:154:0x04de, B:156:0x04ef, B:158:0x04fb, B:193:0x05c7, B:195:0x05cd, B:196:0x05d9, B:198:0x05df, B:200:0x05ef, B:202:0x05f9, B:203:0x060a, B:205:0x0610, B:206:0x062b, B:208:0x0631, B:209:0x064f, B:210:0x065c, B:214:0x0681, B:211:0x0662, B:213:0x066e, B:215:0x0688, B:216:0x06a5, B:218:0x06ab, B:220:0x06be, B:221:0x06cb, B:222:0x06cf, B:224:0x06d5, B:226:0x06e1, B:163:0x0518, B:165:0x0526, B:168:0x0539, B:170:0x054b, B:172:0x0557, B:174:0x0567, B:176:0x0576, B:179:0x0582, B:181:0x058c, B:183:0x0596, B:186:0x05a1, B:188:0x05a7, B:190:0x05b7, B:191:0x05c2, B:131:0x044b, B:133:0x0457, B:135:0x0463, B:148:0x04a9, B:140:0x0481, B:143:0x0493, B:145:0x0499, B:147:0x04a3, B:35:0x0132, B:37:0x013f, B:39:0x014b, B:41:0x0151, B:45:0x015c, B:230:0x071a, B:232:0x072c, B:234:0x0735, B:245:0x0765, B:235:0x073d, B:237:0x0746, B:239:0x074c, B:242:0x0758, B:244:0x0760, B:246:0x0768, B:247:0x0774, B:250:0x077c, B:252:0x078e, B:253:0x0799, B:255:0x07a1, B:259:0x07ce, B:261:0x07e8, B:263:0x07fd, B:265:0x0817, B:267:0x082c, B:268:0x0848, B:270:0x084e, B:272:0x0866, B:273:0x0874, B:275:0x0884, B:276:0x0892, B:277:0x0895, B:279:0x08d7, B:281:0x08dd, B:287:0x0904, B:289:0x090c, B:290:0x092a, B:292:0x0930, B:293:0x0944, B:295:0x0959, B:297:0x0969, B:299:0x0979, B:301:0x0981, B:302:0x0984, B:310:0x0a1c, B:312:0x0a35, B:314:0x0a48, B:316:0x0a4d, B:318:0x0a51, B:320:0x0a55, B:322:0x0a5f, B:324:0x0a68, B:326:0x0a6c, B:328:0x0a72, B:330:0x0a7d, B:332:0x0a8b, B:338:0x0ab3, B:341:0x0abb, B:282:0x08eb, B:284:0x08f1, B:286:0x08f7, B:266:0x0829, B:262:0x07fa, B:256:0x07a7, B:258:0x07ad), top: B:484:0x0017, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0518 A[Catch: all -> 0x00fd, TryCatch #4 {all -> 0x00fd, blocks: (B:3:0x0017, B:5:0x002e, B:8:0x0038, B:9:0x0055, B:12:0x0067, B:15:0x0091, B:17:0x00c6, B:20:0x00d7, B:22:0x00e1, B:227:0x0700, B:26:0x010e, B:29:0x0120, B:31:0x0126, B:46:0x016a, B:48:0x0178, B:51:0x0198, B:53:0x019e, B:55:0x01ae, B:57:0x01bc, B:59:0x01cc, B:60:0x01d9, B:61:0x01dc, B:64:0x01f2, B:73:0x0225, B:76:0x022f, B:78:0x023d, B:82:0x0292, B:79:0x0261, B:81:0x0271, B:86:0x029f, B:89:0x02d4, B:90:0x02fe, B:92:0x0337, B:94:0x033d, B:97:0x0349, B:99:0x0380, B:100:0x039b, B:102:0x03a1, B:104:0x03af, B:108:0x03c4, B:105:0x03b8, B:111:0x03cb, B:114:0x03d2, B:115:0x03f1, B:117:0x040a, B:118:0x0416, B:121:0x0420, B:127:0x0443, B:124:0x0432, B:149:0x04c1, B:151:0x04cd, B:154:0x04de, B:156:0x04ef, B:158:0x04fb, B:193:0x05c7, B:195:0x05cd, B:196:0x05d9, B:198:0x05df, B:200:0x05ef, B:202:0x05f9, B:203:0x060a, B:205:0x0610, B:206:0x062b, B:208:0x0631, B:209:0x064f, B:210:0x065c, B:214:0x0681, B:211:0x0662, B:213:0x066e, B:215:0x0688, B:216:0x06a5, B:218:0x06ab, B:220:0x06be, B:221:0x06cb, B:222:0x06cf, B:224:0x06d5, B:226:0x06e1, B:163:0x0518, B:165:0x0526, B:168:0x0539, B:170:0x054b, B:172:0x0557, B:174:0x0567, B:176:0x0576, B:179:0x0582, B:181:0x058c, B:183:0x0596, B:186:0x05a1, B:188:0x05a7, B:190:0x05b7, B:191:0x05c2, B:131:0x044b, B:133:0x0457, B:135:0x0463, B:148:0x04a9, B:140:0x0481, B:143:0x0493, B:145:0x0499, B:147:0x04a3, B:35:0x0132, B:37:0x013f, B:39:0x014b, B:41:0x0151, B:45:0x015c, B:230:0x071a, B:232:0x072c, B:234:0x0735, B:245:0x0765, B:235:0x073d, B:237:0x0746, B:239:0x074c, B:242:0x0758, B:244:0x0760, B:246:0x0768, B:247:0x0774, B:250:0x077c, B:252:0x078e, B:253:0x0799, B:255:0x07a1, B:259:0x07ce, B:261:0x07e8, B:263:0x07fd, B:265:0x0817, B:267:0x082c, B:268:0x0848, B:270:0x084e, B:272:0x0866, B:273:0x0874, B:275:0x0884, B:276:0x0892, B:277:0x0895, B:279:0x08d7, B:281:0x08dd, B:287:0x0904, B:289:0x090c, B:290:0x092a, B:292:0x0930, B:293:0x0944, B:295:0x0959, B:297:0x0969, B:299:0x0979, B:301:0x0981, B:302:0x0984, B:310:0x0a1c, B:312:0x0a35, B:314:0x0a48, B:316:0x0a4d, B:318:0x0a51, B:320:0x0a55, B:322:0x0a5f, B:324:0x0a68, B:326:0x0a6c, B:328:0x0a72, B:330:0x0a7d, B:332:0x0a8b, B:338:0x0ab3, B:341:0x0abb, B:282:0x08eb, B:284:0x08f1, B:286:0x08f7, B:266:0x0829, B:262:0x07fa, B:256:0x07a7, B:258:0x07ad), top: B:484:0x0017, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x05cd A[Catch: all -> 0x00fd, TryCatch #4 {all -> 0x00fd, blocks: (B:3:0x0017, B:5:0x002e, B:8:0x0038, B:9:0x0055, B:12:0x0067, B:15:0x0091, B:17:0x00c6, B:20:0x00d7, B:22:0x00e1, B:227:0x0700, B:26:0x010e, B:29:0x0120, B:31:0x0126, B:46:0x016a, B:48:0x0178, B:51:0x0198, B:53:0x019e, B:55:0x01ae, B:57:0x01bc, B:59:0x01cc, B:60:0x01d9, B:61:0x01dc, B:64:0x01f2, B:73:0x0225, B:76:0x022f, B:78:0x023d, B:82:0x0292, B:79:0x0261, B:81:0x0271, B:86:0x029f, B:89:0x02d4, B:90:0x02fe, B:92:0x0337, B:94:0x033d, B:97:0x0349, B:99:0x0380, B:100:0x039b, B:102:0x03a1, B:104:0x03af, B:108:0x03c4, B:105:0x03b8, B:111:0x03cb, B:114:0x03d2, B:115:0x03f1, B:117:0x040a, B:118:0x0416, B:121:0x0420, B:127:0x0443, B:124:0x0432, B:149:0x04c1, B:151:0x04cd, B:154:0x04de, B:156:0x04ef, B:158:0x04fb, B:193:0x05c7, B:195:0x05cd, B:196:0x05d9, B:198:0x05df, B:200:0x05ef, B:202:0x05f9, B:203:0x060a, B:205:0x0610, B:206:0x062b, B:208:0x0631, B:209:0x064f, B:210:0x065c, B:214:0x0681, B:211:0x0662, B:213:0x066e, B:215:0x0688, B:216:0x06a5, B:218:0x06ab, B:220:0x06be, B:221:0x06cb, B:222:0x06cf, B:224:0x06d5, B:226:0x06e1, B:163:0x0518, B:165:0x0526, B:168:0x0539, B:170:0x054b, B:172:0x0557, B:174:0x0567, B:176:0x0576, B:179:0x0582, B:181:0x058c, B:183:0x0596, B:186:0x05a1, B:188:0x05a7, B:190:0x05b7, B:191:0x05c2, B:131:0x044b, B:133:0x0457, B:135:0x0463, B:148:0x04a9, B:140:0x0481, B:143:0x0493, B:145:0x0499, B:147:0x04a3, B:35:0x0132, B:37:0x013f, B:39:0x014b, B:41:0x0151, B:45:0x015c, B:230:0x071a, B:232:0x072c, B:234:0x0735, B:245:0x0765, B:235:0x073d, B:237:0x0746, B:239:0x074c, B:242:0x0758, B:244:0x0760, B:246:0x0768, B:247:0x0774, B:250:0x077c, B:252:0x078e, B:253:0x0799, B:255:0x07a1, B:259:0x07ce, B:261:0x07e8, B:263:0x07fd, B:265:0x0817, B:267:0x082c, B:268:0x0848, B:270:0x084e, B:272:0x0866, B:273:0x0874, B:275:0x0884, B:276:0x0892, B:277:0x0895, B:279:0x08d7, B:281:0x08dd, B:287:0x0904, B:289:0x090c, B:290:0x092a, B:292:0x0930, B:293:0x0944, B:295:0x0959, B:297:0x0969, B:299:0x0979, B:301:0x0981, B:302:0x0984, B:310:0x0a1c, B:312:0x0a35, B:314:0x0a48, B:316:0x0a4d, B:318:0x0a51, B:320:0x0a55, B:322:0x0a5f, B:324:0x0a68, B:326:0x0a6c, B:328:0x0a72, B:330:0x0a7d, B:332:0x0a8b, B:338:0x0ab3, B:341:0x0abb, B:282:0x08eb, B:284:0x08f1, B:286:0x08f7, B:266:0x0829, B:262:0x07fa, B:256:0x07a7, B:258:0x07ad), top: B:484:0x0017, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x06df  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x073d A[Catch: all -> 0x00fd, TryCatch #4 {all -> 0x00fd, blocks: (B:3:0x0017, B:5:0x002e, B:8:0x0038, B:9:0x0055, B:12:0x0067, B:15:0x0091, B:17:0x00c6, B:20:0x00d7, B:22:0x00e1, B:227:0x0700, B:26:0x010e, B:29:0x0120, B:31:0x0126, B:46:0x016a, B:48:0x0178, B:51:0x0198, B:53:0x019e, B:55:0x01ae, B:57:0x01bc, B:59:0x01cc, B:60:0x01d9, B:61:0x01dc, B:64:0x01f2, B:73:0x0225, B:76:0x022f, B:78:0x023d, B:82:0x0292, B:79:0x0261, B:81:0x0271, B:86:0x029f, B:89:0x02d4, B:90:0x02fe, B:92:0x0337, B:94:0x033d, B:97:0x0349, B:99:0x0380, B:100:0x039b, B:102:0x03a1, B:104:0x03af, B:108:0x03c4, B:105:0x03b8, B:111:0x03cb, B:114:0x03d2, B:115:0x03f1, B:117:0x040a, B:118:0x0416, B:121:0x0420, B:127:0x0443, B:124:0x0432, B:149:0x04c1, B:151:0x04cd, B:154:0x04de, B:156:0x04ef, B:158:0x04fb, B:193:0x05c7, B:195:0x05cd, B:196:0x05d9, B:198:0x05df, B:200:0x05ef, B:202:0x05f9, B:203:0x060a, B:205:0x0610, B:206:0x062b, B:208:0x0631, B:209:0x064f, B:210:0x065c, B:214:0x0681, B:211:0x0662, B:213:0x066e, B:215:0x0688, B:216:0x06a5, B:218:0x06ab, B:220:0x06be, B:221:0x06cb, B:222:0x06cf, B:224:0x06d5, B:226:0x06e1, B:163:0x0518, B:165:0x0526, B:168:0x0539, B:170:0x054b, B:172:0x0557, B:174:0x0567, B:176:0x0576, B:179:0x0582, B:181:0x058c, B:183:0x0596, B:186:0x05a1, B:188:0x05a7, B:190:0x05b7, B:191:0x05c2, B:131:0x044b, B:133:0x0457, B:135:0x0463, B:148:0x04a9, B:140:0x0481, B:143:0x0493, B:145:0x0499, B:147:0x04a3, B:35:0x0132, B:37:0x013f, B:39:0x014b, B:41:0x0151, B:45:0x015c, B:230:0x071a, B:232:0x072c, B:234:0x0735, B:245:0x0765, B:235:0x073d, B:237:0x0746, B:239:0x074c, B:242:0x0758, B:244:0x0760, B:246:0x0768, B:247:0x0774, B:250:0x077c, B:252:0x078e, B:253:0x0799, B:255:0x07a1, B:259:0x07ce, B:261:0x07e8, B:263:0x07fd, B:265:0x0817, B:267:0x082c, B:268:0x0848, B:270:0x084e, B:272:0x0866, B:273:0x0874, B:275:0x0884, B:276:0x0892, B:277:0x0895, B:279:0x08d7, B:281:0x08dd, B:287:0x0904, B:289:0x090c, B:290:0x092a, B:292:0x0930, B:293:0x0944, B:295:0x0959, B:297:0x0969, B:299:0x0979, B:301:0x0981, B:302:0x0984, B:310:0x0a1c, B:312:0x0a35, B:314:0x0a48, B:316:0x0a4d, B:318:0x0a51, B:320:0x0a55, B:322:0x0a5f, B:324:0x0a68, B:326:0x0a6c, B:328:0x0a72, B:330:0x0a7d, B:332:0x0a8b, B:338:0x0ab3, B:341:0x0abb, B:282:0x08eb, B:284:0x08f1, B:286:0x08f7, B:266:0x0829, B:262:0x07fa, B:256:0x07a7, B:258:0x07ad), top: B:484:0x0017, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0af0 A[Catch: all -> 0x0b21, TryCatch #1 {all -> 0x0b21, blocks: (B:304:0x09e4, B:305:0x09f7, B:307:0x09fd, B:406:0x0cc1, B:336:0x0a9d, B:344:0x0ad6, B:346:0x0af0, B:347:0x0af8, B:349:0x0afe, B:351:0x0b10, B:359:0x0b2b, B:361:0x0b3f, B:362:0x0b62, B:364:0x0b6e, B:366:0x0b84, B:369:0x0bc9, B:375:0x0be5, B:377:0x0bf0, B:379:0x0bf4, B:381:0x0bf8, B:383:0x0bfc, B:384:0x0c08, B:385:0x0c14, B:387:0x0c1a, B:389:0x0c30, B:390:0x0c35, B:405:0x0cbe, B:391:0x0c4d, B:393:0x0c51, B:397:0x0c74, B:399:0x0c94, B:400:0x0c9b, B:404:0x0cb1, B:394:0x0c5c, B:407:0x0ccf, B:409:0x0cde, B:410:0x0cf2, B:411:0x0cfa, B:413:0x0d00, B:416:0x0d1a, B:418:0x0d2a, B:439:0x0dcd, B:420:0x0d44, B:422:0x0d4a, B:424:0x0d52, B:426:0x0d60, B:432:0x0d6e, B:434:0x0d7c, B:436:0x0dbe, B:438:0x0dc5, B:437:0x0dc2, B:433:0x0d79, B:425:0x0d5d), top: B:478:0x09e4 }] */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0b29 A[PHI: r10
      0x0b29: PHI (r10v7 java.lang.String) = (r10v6 java.lang.String), (r10v22 java.lang.String) binds: [B:345:0x0aee, B:541:0x0b29] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0b3f A[Catch: all -> 0x0b21, TryCatch #1 {all -> 0x0b21, blocks: (B:304:0x09e4, B:305:0x09f7, B:307:0x09fd, B:406:0x0cc1, B:336:0x0a9d, B:344:0x0ad6, B:346:0x0af0, B:347:0x0af8, B:349:0x0afe, B:351:0x0b10, B:359:0x0b2b, B:361:0x0b3f, B:362:0x0b62, B:364:0x0b6e, B:366:0x0b84, B:369:0x0bc9, B:375:0x0be5, B:377:0x0bf0, B:379:0x0bf4, B:381:0x0bf8, B:383:0x0bfc, B:384:0x0c08, B:385:0x0c14, B:387:0x0c1a, B:389:0x0c30, B:390:0x0c35, B:405:0x0cbe, B:391:0x0c4d, B:393:0x0c51, B:397:0x0c74, B:399:0x0c94, B:400:0x0c9b, B:404:0x0cb1, B:394:0x0c5c, B:407:0x0ccf, B:409:0x0cde, B:410:0x0cf2, B:411:0x0cfa, B:413:0x0d00, B:416:0x0d1a, B:418:0x0d2a, B:439:0x0dcd, B:420:0x0d44, B:422:0x0d4a, B:424:0x0d52, B:426:0x0d60, B:432:0x0d6e, B:434:0x0d7c, B:436:0x0dbe, B:438:0x0dc5, B:437:0x0dc2, B:433:0x0d79, B:425:0x0d5d), top: B:478:0x09e4 }] */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0b62 A[Catch: all -> 0x0b21, TryCatch #1 {all -> 0x0b21, blocks: (B:304:0x09e4, B:305:0x09f7, B:307:0x09fd, B:406:0x0cc1, B:336:0x0a9d, B:344:0x0ad6, B:346:0x0af0, B:347:0x0af8, B:349:0x0afe, B:351:0x0b10, B:359:0x0b2b, B:361:0x0b3f, B:362:0x0b62, B:364:0x0b6e, B:366:0x0b84, B:369:0x0bc9, B:375:0x0be5, B:377:0x0bf0, B:379:0x0bf4, B:381:0x0bf8, B:383:0x0bfc, B:384:0x0c08, B:385:0x0c14, B:387:0x0c1a, B:389:0x0c30, B:390:0x0c35, B:405:0x0cbe, B:391:0x0c4d, B:393:0x0c51, B:397:0x0c74, B:399:0x0c94, B:400:0x0c9b, B:404:0x0cb1, B:394:0x0c5c, B:407:0x0ccf, B:409:0x0cde, B:410:0x0cf2, B:411:0x0cfa, B:413:0x0d00, B:416:0x0d1a, B:418:0x0d2a, B:439:0x0dcd, B:420:0x0d44, B:422:0x0d4a, B:424:0x0d52, B:426:0x0d60, B:432:0x0d6e, B:434:0x0d7c, B:436:0x0dbe, B:438:0x0dc5, B:437:0x0dc2, B:433:0x0d79, B:425:0x0d5d), top: B:478:0x09e4 }] */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0bdc  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0be0  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0be5 A[Catch: all -> 0x0b21, TryCatch #1 {all -> 0x0b21, blocks: (B:304:0x09e4, B:305:0x09f7, B:307:0x09fd, B:406:0x0cc1, B:336:0x0a9d, B:344:0x0ad6, B:346:0x0af0, B:347:0x0af8, B:349:0x0afe, B:351:0x0b10, B:359:0x0b2b, B:361:0x0b3f, B:362:0x0b62, B:364:0x0b6e, B:366:0x0b84, B:369:0x0bc9, B:375:0x0be5, B:377:0x0bf0, B:379:0x0bf4, B:381:0x0bf8, B:383:0x0bfc, B:384:0x0c08, B:385:0x0c14, B:387:0x0c1a, B:389:0x0c30, B:390:0x0c35, B:405:0x0cbe, B:391:0x0c4d, B:393:0x0c51, B:397:0x0c74, B:399:0x0c94, B:400:0x0c9b, B:404:0x0cb1, B:394:0x0c5c, B:407:0x0ccf, B:409:0x0cde, B:410:0x0cf2, B:411:0x0cfa, B:413:0x0d00, B:416:0x0d1a, B:418:0x0d2a, B:439:0x0dcd, B:420:0x0d44, B:422:0x0d4a, B:424:0x0d52, B:426:0x0d60, B:432:0x0d6e, B:434:0x0d7c, B:436:0x0dbe, B:438:0x0dc5, B:437:0x0dc2, B:433:0x0d79, B:425:0x0d5d), top: B:478:0x09e4 }] */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0c14 A[Catch: all -> 0x0b21, TryCatch #1 {all -> 0x0b21, blocks: (B:304:0x09e4, B:305:0x09f7, B:307:0x09fd, B:406:0x0cc1, B:336:0x0a9d, B:344:0x0ad6, B:346:0x0af0, B:347:0x0af8, B:349:0x0afe, B:351:0x0b10, B:359:0x0b2b, B:361:0x0b3f, B:362:0x0b62, B:364:0x0b6e, B:366:0x0b84, B:369:0x0bc9, B:375:0x0be5, B:377:0x0bf0, B:379:0x0bf4, B:381:0x0bf8, B:383:0x0bfc, B:384:0x0c08, B:385:0x0c14, B:387:0x0c1a, B:389:0x0c30, B:390:0x0c35, B:405:0x0cbe, B:391:0x0c4d, B:393:0x0c51, B:397:0x0c74, B:399:0x0c94, B:400:0x0c9b, B:404:0x0cb1, B:394:0x0c5c, B:407:0x0ccf, B:409:0x0cde, B:410:0x0cf2, B:411:0x0cfa, B:413:0x0d00, B:416:0x0d1a, B:418:0x0d2a, B:439:0x0dcd, B:420:0x0d44, B:422:0x0d4a, B:424:0x0d52, B:426:0x0d60, B:432:0x0d6e, B:434:0x0d7c, B:436:0x0dbe, B:438:0x0dc5, B:437:0x0dc2, B:433:0x0d79, B:425:0x0d5d), top: B:478:0x09e4 }] */
    /* JADX WARN: Removed duplicated region for block: B:441:0x0dd3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x0e43  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x0e62  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x0e93 A[Catch: all -> 0x0e00, TryCatch #0 {all -> 0x0e00, blocks: (B:442:0x0dd5, B:444:0x0dea, B:447:0x0df1, B:454:0x0e33, B:456:0x0e45, B:457:0x0e5c, B:460:0x0e64, B:461:0x0e69, B:462:0x0e79, B:464:0x0e93, B:465:0x0eae, B:466:0x0eb6, B:470:0x0ed4, B:469:0x0ec1, B:450:0x0e03, B:452:0x0e0f, B:453:0x0e1c, B:471:0x0edd), top: B:477:0x002c, inners: #2 }] */
    /* JADX WARN: Type inference failed for: r11v16, types: [js9, lq9] */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1, types: [js9, lq9] */
    /* JADX WARN: Type inference failed for: r17v16 */
    /* JADX WARN: Type inference failed for: r17v17 */
    /* JADX WARN: Type inference failed for: r17v18 */
    /* JADX WARN: Type inference failed for: r17v19 */
    /* JADX WARN: Type inference failed for: r17v20 */
    /* JADX WARN: Type inference failed for: r17v21 */
    /* JADX WARN: Type inference failed for: r17v22 */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1, types: [js9, lq9] */
    /* JADX WARN: Type inference failed for: r18v10 */
    /* JADX WARN: Type inference failed for: r18v11 */
    /* JADX WARN: Type inference failed for: r18v12 */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r18v8 */
    /* JADX WARN: Type inference failed for: r18v9 */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.measurement.internal.zzpg] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.google.android.gms.measurement.internal.zzpg] */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r21v10 */
    /* JADX WARN: Type inference failed for: r21v11 */
    /* JADX WARN: Type inference failed for: r21v12 */
    /* JADX WARN: Type inference failed for: r21v13 */
    /* JADX WARN: Type inference failed for: r21v14 */
    /* JADX WARN: Type inference failed for: r21v15 */
    /* JADX WARN: Type inference failed for: r21v16 */
    /* JADX WARN: Type inference failed for: r21v17 */
    /* JADX WARN: Type inference failed for: r21v18 */
    /* JADX WARN: Type inference failed for: r21v19 */
    /* JADX WARN: Type inference failed for: r21v20 */
    /* JADX WARN: Type inference failed for: r21v21 */
    /* JADX WARN: Type inference failed for: r21v22 */
    /* JADX WARN: Type inference failed for: r21v23 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v121 */
    /* JADX WARN: Type inference failed for: r2v122 */
    /* JADX WARN: Type inference failed for: r2v123 */
    /* JADX WARN: Type inference failed for: r2v124 */
    /* JADX WARN: Type inference failed for: r2v125 */
    /* JADX WARN: Type inference failed for: r2v126 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.google.android.gms.measurement.internal.zzpg] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v37, types: [com.google.android.gms.measurement.internal.zzpg] */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.google.android.gms.measurement.internal.zzpg] */
    /* JADX WARN: Type inference failed for: r2v5, types: [com.google.android.gms.measurement.internal.zzpg] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean zzaG(java.lang.String r44, long r45) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3829
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzpg.zzaG(java.lang.String, long):boolean");
    }

    private final void zzaH(pq9 pq9Var, long j, boolean z) {
        zzpn zzpnVar;
        Object obj;
        String str = true != z ? "_lte" : "_se";
        zzpn zzpnVarZzm = zzj().zzm(pq9Var.i(), str);
        if (zzpnVarZzm == null || (obj = zzpnVarZzm.zze) == null) {
            String strI = pq9Var.i();
            ((eq) zzaZ()).getClass();
            zzpnVar = new zzpn(strI, "auto", str, System.currentTimeMillis(), Long.valueOf(j));
        } else {
            String strI2 = pq9Var.i();
            ((eq) zzaZ()).getClass();
            zzpnVar = new zzpn(strI2, "auto", str, System.currentTimeMillis(), Long.valueOf(((Long) obj).longValue() + j));
        }
        wq9 wq9VarA = j0.A();
        wq9VarA.b();
        ((j0) wq9VarA.b).C(str);
        ((eq) zzaZ()).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        wq9VarA.b();
        ((j0) wq9VarA.b).B(jCurrentTimeMillis);
        Object obj2 = zzpnVar.zze;
        long jLongValue = ((Long) obj2).longValue();
        wq9VarA.b();
        ((j0) wq9VarA.b).F(jLongValue);
        j0 j0Var = (j0) wq9VarA.e();
        int iZzx = zzpk.zzx(pq9Var, str);
        if (iZzx >= 0) {
            pq9Var.b();
            ((e0) pq9Var.b).c0(iZzx, j0Var);
        } else {
            pq9Var.b();
            ((e0) pq9Var.b).d0(j0Var);
        }
        if (j > 0) {
            zzj().zzl(zzpnVar);
            zzaV().zzk().zzc("Updated engagement user property. scope, value", true != z ? "lifetime" : "session-scoped", obj2);
        }
    }

    private final boolean zzaI(lq9 lq9Var, lq9 lq9Var2) {
        rq4.i("_e".equals(lq9Var.n()));
        zzp();
        b0 b0VarZzF = zzpk.zzF((z) lq9Var.e(), "_sc");
        String strS = b0VarZzF == null ? null : b0VarZzF.s();
        zzp();
        b0 b0VarZzF2 = zzpk.zzF((z) lq9Var2.e(), "_pc");
        String strS2 = b0VarZzF2 != null ? b0VarZzF2.s() : null;
        if (strS2 == null || !strS2.equals(strS)) {
            return false;
        }
        rq4.i("_e".equals(lq9Var.n()));
        zzp();
        b0 b0VarZzF3 = zzpk.zzF((z) lq9Var.e(), "_et");
        if (b0VarZzF3 == null || !b0VarZzF3.t() || b0VarZzF3.u() <= 0) {
            return true;
        }
        long jU = b0VarZzF3.u();
        zzp();
        b0 b0VarZzF4 = zzpk.zzF((z) lq9Var2.e(), "_et");
        if (b0VarZzF4 != null && b0VarZzF4.u() > 0) {
            jU += b0VarZzF4.u();
        }
        zzp();
        zzpk.zzC(lq9Var2, "_et", Long.valueOf(jU));
        zzp();
        zzpk.zzC(lq9Var, "_fr", 1L);
        return true;
    }

    private final boolean zzaJ() {
        zzaW().zzg();
        zzu();
        return zzj().zzP() || !TextUtils.isEmpty(zzj().zzF());
    }

    private static String zzaK(Map map, String str) {
        if (map == null) {
            return null;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (str.equalsIgnoreCase((String) entry.getKey())) {
                if (((List) entry.getValue()).isEmpty()) {
                    return null;
                }
                return (String) ((List) entry.getValue()).get(0);
            }
        }
        return null;
    }

    private final void zzaL() {
        long jMax;
        long jMax2;
        zzaW().zzg();
        zzu();
        if (this.zza > 0) {
            ((eq) zzaZ()).getClass();
            long jAbs = 3600000 - Math.abs(SystemClock.elapsedRealtime() - this.zza);
            if (jAbs > 0) {
                zzaV().zzk().zzb("Upload has been suspended. Will update scheduling later in approximately ms", Long.valueOf(jAbs));
                zzk().zzb();
                zzl().zzd();
                return;
            }
            this.zza = 0L;
        }
        if (!this.zzn.zzH() || !zzaJ()) {
            zzaV().zzk().zza("Nothing to upload or uploading impossible");
            zzk().zzb();
            zzl().zzd();
            return;
        }
        ((eq) zzaZ()).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        zzd();
        long jMax3 = Math.max(0L, ((Long) zzfy.zzO.zzb(null)).longValue());
        boolean z = true;
        if (!zzj().zzR() && !zzj().zzG()) {
            z = false;
        }
        if (z) {
            String strZzA = zzd().zzA();
            if (TextUtils.isEmpty(strZzA) || ".none.".equals(strZzA)) {
                zzd();
                jMax = Math.max(0L, ((Long) zzfy.zzI.zzb(null)).longValue());
            } else {
                zzd();
                jMax = Math.max(0L, ((Long) zzfy.zzJ.zzb(null)).longValue());
            }
        } else {
            zzd();
            jMax = Math.max(0L, ((Long) zzfy.zzH.zzb(null)).longValue());
        }
        long jZza = this.zzk.zzd.zza();
        long jZza2 = this.zzk.zze.zza();
        long j = 0;
        boolean z2 = z;
        long jMax4 = Math.max(zzj().zzM(), zzj().zzO());
        if (jMax4 == 0) {
            jMax2 = 0;
        } else {
            long jAbs2 = jCurrentTimeMillis - Math.abs(jMax4 - jCurrentTimeMillis);
            long jAbs3 = jCurrentTimeMillis - Math.abs(jZza - jCurrentTimeMillis);
            long jAbs4 = jCurrentTimeMillis - Math.abs(jZza2 - jCurrentTimeMillis);
            jMax2 = jMax3 + jAbs2;
            long jMax5 = Math.max(jAbs3, jAbs4);
            if (z2 && jMax5 > 0) {
                jMax2 = Math.min(jAbs2, jMax5) + jMax;
            }
            if (!zzp().zzs(jMax5, jMax)) {
                jMax2 = jMax5 + jMax;
            }
            if (jAbs4 != 0 && jAbs4 >= jAbs2) {
                int i = 0;
                while (true) {
                    zzd();
                    if (i >= Math.min(20, Math.max(0, ((Integer) zzfy.zzQ.zzb(null)).intValue()))) {
                        jMax2 = 0;
                        break;
                    }
                    zzd();
                    jMax2 += Math.max(j, ((Long) zzfy.zzP.zzb(null)).longValue()) * (1 << i);
                    if (jMax2 > jAbs4) {
                        break;
                    }
                    i++;
                    j = 0;
                }
            }
            j = 0;
        }
        if (jMax2 == j) {
            zzaV().zzk().zza("Next upload time is 0");
            zzk().zzb();
            zzl().zzd();
            return;
        }
        if (!zzi().zzb()) {
            zzaV().zzk().zza("No network");
            zzk().zza();
            zzl().zzd();
            return;
        }
        long jZza3 = this.zzk.zzc.zza();
        zzd();
        long jMax6 = Math.max(0L, ((Long) zzfy.zzF.zzb(null)).longValue());
        if (!zzp().zzs(jZza3, jMax6)) {
            jMax2 = Math.max(jMax2, jZza3 + jMax6);
        }
        zzk().zzb();
        ((eq) zzaZ()).getClass();
        long jCurrentTimeMillis2 = jMax2 - System.currentTimeMillis();
        if (jCurrentTimeMillis2 <= 0) {
            zzd();
            jCurrentTimeMillis2 = Math.max(0L, ((Long) zzfy.zzK.zzb(null)).longValue());
            zzhe zzheVar = this.zzk.zzd;
            ((eq) zzaZ()).getClass();
            zzheVar.zzb(System.currentTimeMillis());
        }
        zzaV().zzk().zzb("Upload scheduled in approximately ms", Long.valueOf(jCurrentTimeMillis2));
        zzl().zzc(jCurrentTimeMillis2);
    }

    private final void zzaM() {
        zzaW().zzg();
        if (this.zzu || this.zzv || this.zzw) {
            zzaV().zzk().zzd("Not stopping services. fetch, network, upload", Boolean.valueOf(this.zzu), Boolean.valueOf(this.zzv), Boolean.valueOf(this.zzw));
            return;
        }
        zzaV().zzk().zza("Stopping uploading service(s)");
        List list = this.zzq;
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        List list2 = this.zzq;
        rq4.n(list2);
        list2.clear();
    }

    private final Boolean zzaN(zzh zzhVar) {
        try {
            if (zzhVar.zzt() != -2147483648L) {
                if (zzhVar.zzt() == sg9.a(this.zzn.zzaY()).c(0, zzhVar.zzc()).versionCode) {
                    return Boolean.TRUE;
                }
            } else {
                String str = sg9.a(this.zzn.zzaY()).c(0, zzhVar.zzc()).versionName;
                String strZzr = zzhVar.zzr();
                if (strZzr != null && strZzr.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private final zzr zzaO(String str) {
        zzh zzhVarZzu = zzj().zzu(str);
        if (zzhVarZzu == null || TextUtils.isEmpty(zzhVarZzu.zzr())) {
            zzaV().zzj().zzb("No app data available; dropping", str);
            return null;
        }
        Boolean boolZzaN = zzaN(zzhVarZzu);
        if (boolZzaN == null || boolZzaN.booleanValue()) {
            return new zzr(str, zzhVarZzu.zzf(), zzhVarZzu.zzr(), zzhVarZzu.zzt(), zzhVarZzu.zzv(), zzhVarZzu.zzx(), zzhVarZzu.zzz(), (String) null, zzhVarZzu.zzD(), false, zzhVarZzu.zzl(), 0L, 0, zzhVarZzu.zzac(), false, zzhVarZzu.zzae(), zzhVarZzu.zzB(), zzhVarZzu.zzag(), zzB(str).zzl(), "", (String) null, zzhVarZzu.zzai(), zzhVarZzu.zzak(), zzB(str).zzb(), zzx(str).zze(), zzhVarZzu.zzao(), zzhVarZzu.zzaw(), zzhVarZzu.zzay(), zzhVarZzu.zzaH(), 0L, zzhVarZzu.zzaL());
        }
        zzaV().zzb().zzb("App version does not match; dropping. appId", zzgu.zzl(str));
        return null;
    }

    private final boolean zzaP(String str, String str2) {
        zzbc zzbcVarZzf = zzj().zzf(str, str2);
        return zzbcVarZzf == null || zzbcVarZzf.zzc < 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzaQ(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT < 34) {
            context.sendBroadcast(intent);
        } else {
            context.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
        }
    }

    private static final boolean zzaR(zzr zzrVar) {
        return !TextUtils.isEmpty(zzrVar.zzb);
    }

    private static final zzos zzaS(zzos zzosVar) {
        if (zzosVar == null) {
            throw new IllegalStateException("Upload Component not created");
        }
        if (zzosVar.zzav()) {
            return zzosVar;
        }
        throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(zzosVar.getClass())));
    }

    private static final Boolean zzaT(zzr zzrVar) {
        Boolean bool = zzrVar.zzp;
        String str = zzrVar.zzC;
        if (!TextUtils.isEmpty(str)) {
            zzji zzjiVarZza = zze.zzc(str).zza();
            zzji zzjiVar = zzji.UNINITIALIZED;
            int iOrdinal = zzjiVarZza.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                return null;
            }
            if (iOrdinal == 2) {
                return Boolean.TRUE;
            }
            if (iOrdinal == 3) {
                return Boolean.FALSE;
            }
        }
        return bool;
    }

    public final void zzA(String str, zzjl zzjlVar) {
        zzaW().zzg();
        zzu();
        this.zzC.put(str, zzjlVar);
        zzj().zzZ(str, zzjlVar);
    }

    public final zzjl zzB(String str) {
        zzjl zzjlVar = zzjl.zza;
        zzaW().zzg();
        zzu();
        zzjl zzjlVarZzX = (zzjl) this.zzC.get(str);
        if (zzjlVarZzX == null) {
            zzjlVarZzX = zzj().zzX(str);
            if (zzjlVarZzX == null) {
                zzjlVarZzX = zzjl.zza;
            }
            zzA(str, zzjlVarZzX);
        }
        return zzjlVarZzX;
    }

    public final long zzC() {
        ((eq) zzaZ()).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        zznn zznnVar = this.zzk;
        zznnVar.zzaw();
        zznnVar.zzg();
        zzhe zzheVar = zznnVar.zzf;
        long jZza = zzheVar.zza();
        if (jZza == 0) {
            jZza = ((long) zznnVar.zzu.zzk().zzf().nextInt(86400000)) + 1;
            zzheVar.zzb(jZza);
        }
        return ((((jCurrentTimeMillis + jZza) / 1000) / 60) / 60) / 24;
    }

    public final void zzD(zzbg zzbgVar, String str) {
        zzh zzhVarZzu = zzj().zzu(str);
        if (zzhVarZzu == null || TextUtils.isEmpty(zzhVarZzu.zzr())) {
            zzaV().zzj().zzb("No app data available; dropping event", str);
            return;
        }
        Boolean boolZzaN = zzaN(zzhVarZzu);
        if (boolZzaN == null) {
            if (!"_ui".equals(zzbgVar.zza)) {
                zzaV().zze().zzb("Could not find package. appId", zzgu.zzl(str));
            }
        } else if (!boolZzaN.booleanValue()) {
            zzaV().zzb().zzb("App version does not match; dropping event. appId", zzgu.zzl(str));
            return;
        }
        zzE(zzbgVar, new zzr(str, zzhVarZzu.zzf(), zzhVarZzu.zzr(), zzhVarZzu.zzt(), zzhVarZzu.zzv(), zzhVarZzu.zzx(), zzhVarZzu.zzz(), (String) null, zzhVarZzu.zzD(), false, zzhVarZzu.zzl(), 0L, 0, zzhVarZzu.zzac(), false, zzhVarZzu.zzae(), zzhVarZzu.zzB(), zzhVarZzu.zzag(), zzB(str).zzl(), "", (String) null, zzhVarZzu.zzai(), zzhVarZzu.zzak(), zzB(str).zzb(), zzx(str).zze(), zzhVarZzu.zzao(), zzhVarZzu.zzaw(), zzhVarZzu.zzay(), zzhVarZzu.zzaH(), 0L, zzhVarZzu.zzaL()));
    }

    public final void zzE(zzbg zzbgVar, zzr zzrVar) {
        String str = zzrVar.zza;
        rq4.k(str);
        zzgv zzgvVarZza = zzgv.zza(zzbgVar);
        zzt().zzI(zzgvVarZza.zzd, zzj().zzU(str));
        zzt().zzG(zzgvVarZza, zzd().zzd(str));
        zzbg zzbgVarZzb = zzgvVarZza.zzb();
        if (!zzd().zzp(null, zzfy.zzbf) && "_cmp".equals(zzbgVarZzb.zza)) {
            zzbe zzbeVar = zzbgVarZzb.zzb;
            if ("referrer API v2".equals(zzbeVar.zzd("_cis"))) {
                String strZzd = zzbeVar.zzd("gclid");
                if (!TextUtils.isEmpty(strZzd)) {
                    zzac(new zzpl("_lgclid", zzbgVarZzb.zzd, strZzd, "auto"), zzrVar);
                }
            }
        }
        zzF(zzbgVarZzb, zzrVar);
    }

    public final void zzF(zzbg zzbgVar, zzr zzrVar) {
        zzbg zzbgVar2;
        List<zzah> listZzt;
        List<zzah> listZzt2;
        List<zzah> listZzt3;
        String str;
        rq4.n(zzrVar);
        String str2 = zzrVar.zza;
        rq4.k(str2);
        zzaW().zzg();
        zzu();
        long j = zzbgVar.zzd;
        zzgv zzgvVarZza = zzgv.zza(zzbgVar);
        zzaW().zzg();
        zzpp.zzav((this.zzG == null || (str = this.zzH) == null || !str.equals(str2)) ? null : this.zzG, zzgvVarZza.zzd, false);
        zzbg zzbgVarZzb = zzgvVarZza.zzb();
        zzp();
        if (zzpk.zzD(zzbgVarZzb, zzrVar)) {
            if (!zzrVar.zzh) {
                zzao(zzrVar);
                return;
            }
            List list = zzrVar.zzr;
            if (list != null) {
                String str3 = zzbgVarZzb.zza;
                if (!list.contains(str3)) {
                    zzaV().zzj().zzd("Dropping non-safelisted event. appId, event name, origin", str2, zzbgVarZzb.zza, zzbgVarZzb.zzc);
                    return;
                } else {
                    Bundle bundleZzf = zzbgVarZzb.zzb.zzf();
                    bundleZzf.putLong("ga_safelisted", 1L);
                    zzbgVar2 = new zzbg(str3, new zzbe(bundleZzf), zzbgVarZzb.zzc, zzbgVarZzb.zzd);
                }
            } else {
                zzbgVar2 = zzbgVarZzb;
            }
            zzj().zzb();
            try {
                String str4 = zzbgVar2.zza;
                if ("_s".equals(str4) && !zzj().zzQ(str2, "_s") && zzbgVar2.zzb.zzb("_sid").longValue() != 0) {
                    if (zzj().zzQ(str2, "_f") || zzj().zzQ(str2, "_v")) {
                        zzj().zzW(str2, null, "_sid", zzG(str2, zzbgVar2));
                    } else {
                        zzav zzavVarZzj = zzj();
                        ((eq) zzaZ()).getClass();
                        zzavVarZzj.zzW(str2, Long.valueOf(System.currentTimeMillis() - 15000), "_sid", zzG(str2, zzbgVar2));
                    }
                }
                zzav zzavVarZzj2 = zzj();
                rq4.k(str2);
                zzavVarZzj2.zzg();
                zzavVarZzj2.zzaw();
                if (j < 0) {
                    zzavVarZzj2.zzu.zzaV().zze().zzc("Invalid time querying timed out conditional properties", zzgu.zzl(str2), Long.valueOf(j));
                    listZzt = Collections.EMPTY_LIST;
                } else {
                    listZzt = zzavVarZzj2.zzt("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j)});
                }
                for (zzah zzahVar : listZzt) {
                    if (zzahVar != null) {
                        zzaV().zzk().zzd("User property timed out", zzahVar.zza, this.zzn.zzl().zzc(zzahVar.zzc.zzb), zzahVar.zzc.zza());
                        zzbg zzbgVar3 = zzahVar.zzg;
                        if (zzbgVar3 != null) {
                            zzH(new zzbg(zzbgVar3, j), zzrVar);
                        }
                        zzj().zzr(str2, zzahVar.zzc.zzb);
                    }
                }
                zzav zzavVarZzj3 = zzj();
                rq4.k(str2);
                zzavVarZzj3.zzg();
                zzavVarZzj3.zzaw();
                if (j < 0) {
                    zzavVarZzj3.zzu.zzaV().zze().zzc("Invalid time querying expired conditional properties", zzgu.zzl(str2), Long.valueOf(j));
                    listZzt2 = Collections.EMPTY_LIST;
                } else {
                    listZzt2 = zzavVarZzj3.zzt("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j)});
                }
                ArrayList arrayList = new ArrayList(listZzt2.size());
                for (zzah zzahVar2 : listZzt2) {
                    if (zzahVar2 != null) {
                        zzaV().zzk().zzd("User property expired", zzahVar2.zza, this.zzn.zzl().zzc(zzahVar2.zzc.zzb), zzahVar2.zzc.zza());
                        zzj().zzk(str2, zzahVar2.zzc.zzb);
                        zzbg zzbgVar4 = zzahVar2.zzk;
                        if (zzbgVar4 != null) {
                            arrayList.add(zzbgVar4);
                        }
                        zzj().zzr(str2, zzahVar2.zzc.zzb);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    zzH(new zzbg((zzbg) it.next(), j), zzrVar);
                }
                zzav zzavVarZzj4 = zzj();
                rq4.k(str2);
                rq4.k(str4);
                zzavVarZzj4.zzg();
                zzavVarZzj4.zzaw();
                if (j < 0) {
                    zzic zzicVar = zzavVarZzj4.zzu;
                    zzicVar.zzaV().zze().zzd("Invalid time querying triggered conditional properties", zzgu.zzl(str2), zzicVar.zzl().zza(str4), Long.valueOf(j));
                    listZzt3 = Collections.EMPTY_LIST;
                } else {
                    listZzt3 = zzavVarZzj4.zzt("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str4, String.valueOf(j)});
                }
                ArrayList arrayList2 = new ArrayList(listZzt3.size());
                for (zzah zzahVar3 : listZzt3) {
                    if (zzahVar3 != null) {
                        zzpl zzplVar = zzahVar3.zzc;
                        String str5 = zzahVar3.zza;
                        rq4.n(str5);
                        String str6 = zzahVar3.zzb;
                        String str7 = zzplVar.zzb;
                        Object objZza = zzplVar.zza();
                        rq4.n(objZza);
                        zzpn zzpnVar = new zzpn(str5, str6, str7, j, objZza);
                        if (zzj().zzl(zzpnVar)) {
                            zzaV().zzk().zzd("User property triggered", zzahVar3.zza, this.zzn.zzl().zzc(zzpnVar.zzc), zzpnVar.zze);
                        } else {
                            zzaV().zzb().zzd("Too many active user properties, ignoring", zzgu.zzl(zzahVar3.zza), this.zzn.zzl().zzc(zzpnVar.zzc), zzpnVar.zze);
                        }
                        zzbg zzbgVar5 = zzahVar3.zzi;
                        if (zzbgVar5 != null) {
                            arrayList2.add(zzbgVar5);
                        }
                        zzahVar3.zzc = new zzpl(zzpnVar);
                        zzahVar3.zze = true;
                        zzj().zzp(zzahVar3);
                    }
                }
                zzH(zzbgVar2, zzrVar);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    zzH(new zzbg((zzbg) it2.next(), j), zzrVar);
                }
                zzj().zzc();
                zzj().zzd();
            } catch (Throwable th) {
                zzj().zzd();
                throw th;
            }
        }
    }

    public final Bundle zzG(String str, zzbg zzbgVar) {
        Bundle bundle = new Bundle();
        bundle.putLong("_sid", zzbgVar.zzb.zzb("_sid").longValue());
        zzpn zzpnVarZzm = zzj().zzm(str, "_sno");
        if (zzpnVarZzm != null) {
            Object obj = zzpnVarZzm.zze;
            if (obj instanceof Long) {
                bundle.putLong("_sno", ((Long) obj).longValue());
            }
        }
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0379 A[Catch: all -> 0x017e, TryCatch #7 {all -> 0x017e, blocks: (B:36:0x015a, B:39:0x016b, B:41:0x0173, B:47:0x0181, B:89:0x0305, B:98:0x0338, B:100:0x0379, B:102:0x037e, B:103:0x0395, B:105:0x03a0, B:107:0x03b9, B:109:0x03be, B:110:0x03d5, B:113:0x03f7, B:117:0x041a, B:118:0x0431, B:120:0x043d, B:123:0x045a, B:124:0x046e, B:126:0x0476, B:128:0x0482, B:130:0x0488, B:131:0x048f, B:133:0x049c, B:135:0x04a4, B:137:0x04ac, B:139:0x04b4, B:140:0x04c0, B:141:0x04cd, B:147:0x050f, B:148:0x0524, B:150:0x0546, B:153:0x055d, B:156:0x0598, B:158:0x05c3, B:160:0x0600, B:161:0x060a, B:163:0x0612, B:164:0x061c, B:166:0x0624, B:167:0x062e, B:169:0x0636, B:170:0x0640, B:172:0x0649, B:173:0x0654, B:175:0x0668, B:176:0x0672, B:178:0x06a2, B:180:0x06ac, B:184:0x06c1, B:189:0x06cd, B:192:0x06d6, B:196:0x06e4, B:200:0x06f2, B:204:0x0700, B:208:0x070e, B:212:0x071c, B:216:0x0728, B:220:0x0736, B:221:0x0742, B:223:0x0748, B:224:0x0752, B:226:0x077a, B:229:0x0783, B:232:0x078c, B:233:0x07a6, B:235:0x07ac, B:237:0x07c0, B:239:0x07cc, B:241:0x07d9, B:244:0x07f2, B:245:0x0802, B:249:0x080b, B:250:0x080e, B:252:0x081b, B:253:0x081e, B:255:0x0839, B:257:0x083d, B:259:0x084d, B:261:0x085f, B:262:0x086f, B:264:0x0879, B:266:0x0885, B:268:0x088f, B:270:0x0895, B:272:0x08a4, B:274:0x08bc, B:276:0x08c2, B:277:0x08cb, B:279:0x08d8, B:281:0x0937, B:284:0x0942, B:285:0x094c, B:286:0x094d, B:288:0x0957, B:290:0x0973, B:291:0x097e, B:293:0x09b6, B:295:0x09be, B:297:0x09c8, B:298:0x09d9, B:300:0x09e3, B:301:0x09f4, B:302:0x09fd, B:304:0x0a03, B:306:0x0a4d, B:308:0x0a57, B:310:0x0a69, B:312:0x0a76, B:313:0x0ab8, B:314:0x0ac3, B:315:0x0ace, B:317:0x0ad4, B:326:0x0b1f, B:327:0x0b67, B:329:0x0b76, B:343:0x0bd7, B:334:0x0b8e, B:335:0x0b91, B:320:0x0adf, B:322:0x0b0b, B:340:0x0baa, B:341:0x0bc1, B:342:0x0bc2, B:227:0x077d, B:157:0x05b5, B:144:0x04f6, B:92:0x0319, B:93:0x0320, B:95:0x0326, B:97:0x0332, B:53:0x019a, B:55:0x01a6, B:57:0x01bb, B:63:0x01db, B:68:0x0211, B:70:0x0217, B:72:0x0225, B:74:0x0233, B:77:0x023d, B:85:0x02cb, B:87:0x02d5, B:79:0x026a, B:80:0x0283, B:84:0x02a9, B:83:0x0296, B:66:0x01e7, B:67:0x0205), top: B:362:0x015a, inners: #0, #1, #3, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x08d6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01a6 A[Catch: all -> 0x017e, TryCatch #7 {all -> 0x017e, blocks: (B:36:0x015a, B:39:0x016b, B:41:0x0173, B:47:0x0181, B:89:0x0305, B:98:0x0338, B:100:0x0379, B:102:0x037e, B:103:0x0395, B:105:0x03a0, B:107:0x03b9, B:109:0x03be, B:110:0x03d5, B:113:0x03f7, B:117:0x041a, B:118:0x0431, B:120:0x043d, B:123:0x045a, B:124:0x046e, B:126:0x0476, B:128:0x0482, B:130:0x0488, B:131:0x048f, B:133:0x049c, B:135:0x04a4, B:137:0x04ac, B:139:0x04b4, B:140:0x04c0, B:141:0x04cd, B:147:0x050f, B:148:0x0524, B:150:0x0546, B:153:0x055d, B:156:0x0598, B:158:0x05c3, B:160:0x0600, B:161:0x060a, B:163:0x0612, B:164:0x061c, B:166:0x0624, B:167:0x062e, B:169:0x0636, B:170:0x0640, B:172:0x0649, B:173:0x0654, B:175:0x0668, B:176:0x0672, B:178:0x06a2, B:180:0x06ac, B:184:0x06c1, B:189:0x06cd, B:192:0x06d6, B:196:0x06e4, B:200:0x06f2, B:204:0x0700, B:208:0x070e, B:212:0x071c, B:216:0x0728, B:220:0x0736, B:221:0x0742, B:223:0x0748, B:224:0x0752, B:226:0x077a, B:229:0x0783, B:232:0x078c, B:233:0x07a6, B:235:0x07ac, B:237:0x07c0, B:239:0x07cc, B:241:0x07d9, B:244:0x07f2, B:245:0x0802, B:249:0x080b, B:250:0x080e, B:252:0x081b, B:253:0x081e, B:255:0x0839, B:257:0x083d, B:259:0x084d, B:261:0x085f, B:262:0x086f, B:264:0x0879, B:266:0x0885, B:268:0x088f, B:270:0x0895, B:272:0x08a4, B:274:0x08bc, B:276:0x08c2, B:277:0x08cb, B:279:0x08d8, B:281:0x0937, B:284:0x0942, B:285:0x094c, B:286:0x094d, B:288:0x0957, B:290:0x0973, B:291:0x097e, B:293:0x09b6, B:295:0x09be, B:297:0x09c8, B:298:0x09d9, B:300:0x09e3, B:301:0x09f4, B:302:0x09fd, B:304:0x0a03, B:306:0x0a4d, B:308:0x0a57, B:310:0x0a69, B:312:0x0a76, B:313:0x0ab8, B:314:0x0ac3, B:315:0x0ace, B:317:0x0ad4, B:326:0x0b1f, B:327:0x0b67, B:329:0x0b76, B:343:0x0bd7, B:334:0x0b8e, B:335:0x0b91, B:320:0x0adf, B:322:0x0b0b, B:340:0x0baa, B:341:0x0bc1, B:342:0x0bc2, B:227:0x077d, B:157:0x05b5, B:144:0x04f6, B:92:0x0319, B:93:0x0320, B:95:0x0326, B:97:0x0332, B:53:0x019a, B:55:0x01a6, B:57:0x01bb, B:63:0x01db, B:68:0x0211, B:70:0x0217, B:72:0x0225, B:74:0x0233, B:77:0x023d, B:85:0x02cb, B:87:0x02d5, B:79:0x026a, B:80:0x0283, B:84:0x02a9, B:83:0x0296, B:66:0x01e7, B:67:0x0205), top: B:362:0x015a, inners: #0, #1, #3, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0205 A[Catch: all -> 0x017e, TryCatch #7 {all -> 0x017e, blocks: (B:36:0x015a, B:39:0x016b, B:41:0x0173, B:47:0x0181, B:89:0x0305, B:98:0x0338, B:100:0x0379, B:102:0x037e, B:103:0x0395, B:105:0x03a0, B:107:0x03b9, B:109:0x03be, B:110:0x03d5, B:113:0x03f7, B:117:0x041a, B:118:0x0431, B:120:0x043d, B:123:0x045a, B:124:0x046e, B:126:0x0476, B:128:0x0482, B:130:0x0488, B:131:0x048f, B:133:0x049c, B:135:0x04a4, B:137:0x04ac, B:139:0x04b4, B:140:0x04c0, B:141:0x04cd, B:147:0x050f, B:148:0x0524, B:150:0x0546, B:153:0x055d, B:156:0x0598, B:158:0x05c3, B:160:0x0600, B:161:0x060a, B:163:0x0612, B:164:0x061c, B:166:0x0624, B:167:0x062e, B:169:0x0636, B:170:0x0640, B:172:0x0649, B:173:0x0654, B:175:0x0668, B:176:0x0672, B:178:0x06a2, B:180:0x06ac, B:184:0x06c1, B:189:0x06cd, B:192:0x06d6, B:196:0x06e4, B:200:0x06f2, B:204:0x0700, B:208:0x070e, B:212:0x071c, B:216:0x0728, B:220:0x0736, B:221:0x0742, B:223:0x0748, B:224:0x0752, B:226:0x077a, B:229:0x0783, B:232:0x078c, B:233:0x07a6, B:235:0x07ac, B:237:0x07c0, B:239:0x07cc, B:241:0x07d9, B:244:0x07f2, B:245:0x0802, B:249:0x080b, B:250:0x080e, B:252:0x081b, B:253:0x081e, B:255:0x0839, B:257:0x083d, B:259:0x084d, B:261:0x085f, B:262:0x086f, B:264:0x0879, B:266:0x0885, B:268:0x088f, B:270:0x0895, B:272:0x08a4, B:274:0x08bc, B:276:0x08c2, B:277:0x08cb, B:279:0x08d8, B:281:0x0937, B:284:0x0942, B:285:0x094c, B:286:0x094d, B:288:0x0957, B:290:0x0973, B:291:0x097e, B:293:0x09b6, B:295:0x09be, B:297:0x09c8, B:298:0x09d9, B:300:0x09e3, B:301:0x09f4, B:302:0x09fd, B:304:0x0a03, B:306:0x0a4d, B:308:0x0a57, B:310:0x0a69, B:312:0x0a76, B:313:0x0ab8, B:314:0x0ac3, B:315:0x0ace, B:317:0x0ad4, B:326:0x0b1f, B:327:0x0b67, B:329:0x0b76, B:343:0x0bd7, B:334:0x0b8e, B:335:0x0b91, B:320:0x0adf, B:322:0x0b0b, B:340:0x0baa, B:341:0x0bc1, B:342:0x0bc2, B:227:0x077d, B:157:0x05b5, B:144:0x04f6, B:92:0x0319, B:93:0x0320, B:95:0x0326, B:97:0x0332, B:53:0x019a, B:55:0x01a6, B:57:0x01bb, B:63:0x01db, B:68:0x0211, B:70:0x0217, B:72:0x0225, B:74:0x0233, B:77:0x023d, B:85:0x02cb, B:87:0x02d5, B:79:0x026a, B:80:0x0283, B:84:0x02a9, B:83:0x0296, B:66:0x01e7, B:67:0x0205), top: B:362:0x015a, inners: #0, #1, #3, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0217 A[Catch: all -> 0x017e, TryCatch #7 {all -> 0x017e, blocks: (B:36:0x015a, B:39:0x016b, B:41:0x0173, B:47:0x0181, B:89:0x0305, B:98:0x0338, B:100:0x0379, B:102:0x037e, B:103:0x0395, B:105:0x03a0, B:107:0x03b9, B:109:0x03be, B:110:0x03d5, B:113:0x03f7, B:117:0x041a, B:118:0x0431, B:120:0x043d, B:123:0x045a, B:124:0x046e, B:126:0x0476, B:128:0x0482, B:130:0x0488, B:131:0x048f, B:133:0x049c, B:135:0x04a4, B:137:0x04ac, B:139:0x04b4, B:140:0x04c0, B:141:0x04cd, B:147:0x050f, B:148:0x0524, B:150:0x0546, B:153:0x055d, B:156:0x0598, B:158:0x05c3, B:160:0x0600, B:161:0x060a, B:163:0x0612, B:164:0x061c, B:166:0x0624, B:167:0x062e, B:169:0x0636, B:170:0x0640, B:172:0x0649, B:173:0x0654, B:175:0x0668, B:176:0x0672, B:178:0x06a2, B:180:0x06ac, B:184:0x06c1, B:189:0x06cd, B:192:0x06d6, B:196:0x06e4, B:200:0x06f2, B:204:0x0700, B:208:0x070e, B:212:0x071c, B:216:0x0728, B:220:0x0736, B:221:0x0742, B:223:0x0748, B:224:0x0752, B:226:0x077a, B:229:0x0783, B:232:0x078c, B:233:0x07a6, B:235:0x07ac, B:237:0x07c0, B:239:0x07cc, B:241:0x07d9, B:244:0x07f2, B:245:0x0802, B:249:0x080b, B:250:0x080e, B:252:0x081b, B:253:0x081e, B:255:0x0839, B:257:0x083d, B:259:0x084d, B:261:0x085f, B:262:0x086f, B:264:0x0879, B:266:0x0885, B:268:0x088f, B:270:0x0895, B:272:0x08a4, B:274:0x08bc, B:276:0x08c2, B:277:0x08cb, B:279:0x08d8, B:281:0x0937, B:284:0x0942, B:285:0x094c, B:286:0x094d, B:288:0x0957, B:290:0x0973, B:291:0x097e, B:293:0x09b6, B:295:0x09be, B:297:0x09c8, B:298:0x09d9, B:300:0x09e3, B:301:0x09f4, B:302:0x09fd, B:304:0x0a03, B:306:0x0a4d, B:308:0x0a57, B:310:0x0a69, B:312:0x0a76, B:313:0x0ab8, B:314:0x0ac3, B:315:0x0ace, B:317:0x0ad4, B:326:0x0b1f, B:327:0x0b67, B:329:0x0b76, B:343:0x0bd7, B:334:0x0b8e, B:335:0x0b91, B:320:0x0adf, B:322:0x0b0b, B:340:0x0baa, B:341:0x0bc1, B:342:0x0bc2, B:227:0x077d, B:157:0x05b5, B:144:0x04f6, B:92:0x0319, B:93:0x0320, B:95:0x0326, B:97:0x0332, B:53:0x019a, B:55:0x01a6, B:57:0x01bb, B:63:0x01db, B:68:0x0211, B:70:0x0217, B:72:0x0225, B:74:0x0233, B:77:0x023d, B:85:0x02cb, B:87:0x02d5, B:79:0x026a, B:80:0x0283, B:84:0x02a9, B:83:0x0296, B:66:0x01e7, B:67:0x0205), top: B:362:0x015a, inners: #0, #1, #3, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0319 A[Catch: all -> 0x017e, TryCatch #7 {all -> 0x017e, blocks: (B:36:0x015a, B:39:0x016b, B:41:0x0173, B:47:0x0181, B:89:0x0305, B:98:0x0338, B:100:0x0379, B:102:0x037e, B:103:0x0395, B:105:0x03a0, B:107:0x03b9, B:109:0x03be, B:110:0x03d5, B:113:0x03f7, B:117:0x041a, B:118:0x0431, B:120:0x043d, B:123:0x045a, B:124:0x046e, B:126:0x0476, B:128:0x0482, B:130:0x0488, B:131:0x048f, B:133:0x049c, B:135:0x04a4, B:137:0x04ac, B:139:0x04b4, B:140:0x04c0, B:141:0x04cd, B:147:0x050f, B:148:0x0524, B:150:0x0546, B:153:0x055d, B:156:0x0598, B:158:0x05c3, B:160:0x0600, B:161:0x060a, B:163:0x0612, B:164:0x061c, B:166:0x0624, B:167:0x062e, B:169:0x0636, B:170:0x0640, B:172:0x0649, B:173:0x0654, B:175:0x0668, B:176:0x0672, B:178:0x06a2, B:180:0x06ac, B:184:0x06c1, B:189:0x06cd, B:192:0x06d6, B:196:0x06e4, B:200:0x06f2, B:204:0x0700, B:208:0x070e, B:212:0x071c, B:216:0x0728, B:220:0x0736, B:221:0x0742, B:223:0x0748, B:224:0x0752, B:226:0x077a, B:229:0x0783, B:232:0x078c, B:233:0x07a6, B:235:0x07ac, B:237:0x07c0, B:239:0x07cc, B:241:0x07d9, B:244:0x07f2, B:245:0x0802, B:249:0x080b, B:250:0x080e, B:252:0x081b, B:253:0x081e, B:255:0x0839, B:257:0x083d, B:259:0x084d, B:261:0x085f, B:262:0x086f, B:264:0x0879, B:266:0x0885, B:268:0x088f, B:270:0x0895, B:272:0x08a4, B:274:0x08bc, B:276:0x08c2, B:277:0x08cb, B:279:0x08d8, B:281:0x0937, B:284:0x0942, B:285:0x094c, B:286:0x094d, B:288:0x0957, B:290:0x0973, B:291:0x097e, B:293:0x09b6, B:295:0x09be, B:297:0x09c8, B:298:0x09d9, B:300:0x09e3, B:301:0x09f4, B:302:0x09fd, B:304:0x0a03, B:306:0x0a4d, B:308:0x0a57, B:310:0x0a69, B:312:0x0a76, B:313:0x0ab8, B:314:0x0ac3, B:315:0x0ace, B:317:0x0ad4, B:326:0x0b1f, B:327:0x0b67, B:329:0x0b76, B:343:0x0bd7, B:334:0x0b8e, B:335:0x0b91, B:320:0x0adf, B:322:0x0b0b, B:340:0x0baa, B:341:0x0bc1, B:342:0x0bc2, B:227:0x077d, B:157:0x05b5, B:144:0x04f6, B:92:0x0319, B:93:0x0320, B:95:0x0326, B:97:0x0332, B:53:0x019a, B:55:0x01a6, B:57:0x01bb, B:63:0x01db, B:68:0x0211, B:70:0x0217, B:72:0x0225, B:74:0x0233, B:77:0x023d, B:85:0x02cb, B:87:0x02d5, B:79:0x026a, B:80:0x0283, B:84:0x02a9, B:83:0x0296, B:66:0x01e7, B:67:0x0205), top: B:362:0x015a, inners: #0, #1, #3, #4, #5 }] */
    /* JADX WARN: Type inference failed for: r5v52 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzH(com.google.android.gms.measurement.internal.zzbg r45, com.google.android.gms.measurement.internal.zzr r46) {
        /*
            Method dump skipped, instruction units count: 3088
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzpg.zzH(com.google.android.gms.measurement.internal.zzbg, com.google.android.gms.measurement.internal.zzr):void");
    }

    public final void zzI(zzh zzhVar, pq9 pq9Var) {
        j0 j0Var;
        zzaW().zzg();
        zzu();
        zzan zzanVarZzd = zzan.zzd(((e0) pq9Var.b).C0());
        String strZzc = zzhVar.zzc();
        zzaW().zzg();
        zzu();
        zzjl zzjlVarZzB = zzB(strZzc);
        zzji zzjiVar = zzji.UNINITIALIZED;
        int iOrdinal = zzjlVarZzB.zzp().ordinal();
        if (iOrdinal == 1) {
            zzanVarZzd.zzc(zzjk.AD_STORAGE, zzam.REMOTE_ENFORCED_DEFAULT);
        } else if (iOrdinal == 2 || iOrdinal == 3) {
            zzanVarZzd.zzb(zzjk.AD_STORAGE, zzjlVarZzB.zzb());
        } else {
            zzanVarZzd.zzc(zzjk.AD_STORAGE, zzam.FAILSAFE);
        }
        int iOrdinal2 = zzjlVarZzB.zzq().ordinal();
        if (iOrdinal2 == 1) {
            zzanVarZzd.zzc(zzjk.ANALYTICS_STORAGE, zzam.REMOTE_ENFORCED_DEFAULT);
        } else if (iOrdinal2 == 2 || iOrdinal2 == 3) {
            zzanVarZzd.zzb(zzjk.ANALYTICS_STORAGE, zzjlVarZzB.zzb());
        } else {
            zzanVarZzd.zzc(zzjk.ANALYTICS_STORAGE, zzam.FAILSAFE);
        }
        String strZzc2 = zzhVar.zzc();
        zzaW().zzg();
        zzu();
        zzaz zzazVarZzz = zzz(strZzc2, zzx(strZzc2), zzB(strZzc2), zzanVarZzd);
        Boolean boolZzj = zzazVarZzz.zzj();
        rq4.n(boolZzj);
        boolean zBooleanValue = boolZzj.booleanValue();
        pq9Var.b();
        ((e0) pq9Var.b).h1(zBooleanValue);
        if (!TextUtils.isEmpty(zzazVarZzz.zzk())) {
            String strZzk = zzazVarZzz.zzk();
            pq9Var.b();
            ((e0) pq9Var.b).i1(strZzk);
        }
        zzaW().zzg();
        zzu();
        Iterator it = DesugarCollections.unmodifiableList(((e0) pq9Var.b).W1()).iterator();
        while (true) {
            if (it.hasNext()) {
                j0Var = (j0) it.next();
                if ("_npa".equals(j0Var.r())) {
                    break;
                }
            } else {
                j0Var = null;
                break;
            }
        }
        if (j0Var != null) {
            zzjk zzjkVar = zzjk.AD_PERSONALIZATION;
            if (zzanVarZzd.zza(zzjkVar) == zzam.UNSET) {
                zzpn zzpnVarZzm = zzj().zzm(zzhVar.zzc(), "_npa");
                if (zzpnVarZzm != null) {
                    String str = zzpnVarZzm.zzb;
                    if ("tcf".equals(str)) {
                        zzanVarZzd.zzc(zzjkVar, zzam.TCF);
                    } else if ("app".equals(str)) {
                        zzanVarZzd.zzc(zzjkVar, zzam.API);
                    } else {
                        zzanVarZzd.zzc(zzjkVar, zzam.MANIFEST);
                    }
                } else {
                    Boolean boolZzae = zzhVar.zzae();
                    if (boolZzae == null || ((boolZzae.booleanValue() && j0Var.v() != 1) || !(boolZzae.booleanValue() || j0Var.v() == 0))) {
                        zzanVarZzd.zzc(zzjkVar, zzam.API);
                    } else {
                        zzanVarZzd.zzc(zzjkVar, zzam.MANIFEST);
                    }
                }
            }
        } else {
            int iZzaC = zzaC(zzhVar.zzc(), zzanVarZzd);
            wq9 wq9VarA = j0.A();
            wq9VarA.b();
            ((j0) wq9VarA.b).C("_npa");
            ((eq) zzaZ()).getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            wq9VarA.b();
            ((j0) wq9VarA.b).B(jCurrentTimeMillis);
            wq9VarA.b();
            ((j0) wq9VarA.b).F(iZzaC);
            j0 j0Var2 = (j0) wq9VarA.e();
            pq9Var.b();
            ((e0) pq9Var.b).d0(j0Var2);
            zzaV().zzk().zzc("Setting user property", "non_personalized_ads(_npa)", Integer.valueOf(iZzaC));
        }
        String string = zzanVarZzd.toString();
        pq9Var.b();
        ((e0) pq9Var.b).g1(string);
        boolean zZzy = this.zzc.zzy(zzhVar.zzc());
        List listV = pq9Var.v();
        int i = 0;
        for (int i2 = 0; i2 < listV.size(); i2++) {
            if ("_tcf".equals(((z) listV.get(i2)).s())) {
                lq9 lq9Var = (lq9) ((z) listV.get(i2)).i();
                List listH = lq9Var.h();
                int i3 = 0;
                while (true) {
                    if (i3 >= listH.size()) {
                        break;
                    }
                    if ("_tcfd".equals(((b0) listH.get(i3)).q())) {
                        String strS = ((b0) listH.get(i3)).s();
                        if (zZzy && strS.length() > 4) {
                            char[] charArray = strS.toCharArray();
                            int i4 = 1;
                            while (true) {
                                if (i4 >= 64) {
                                    break;
                                }
                                if (charArray[4] == "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i4)) {
                                    i = i4;
                                    break;
                                }
                                i4++;
                            }
                            charArray[4] = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i | 1);
                            strS = String.valueOf(charArray);
                        }
                        nq9 nq9VarB = b0.B();
                        nq9VarB.h("_tcfd");
                        nq9VarB.i(strS);
                        lq9Var.b();
                        ((z) lq9Var.b).A(i3, (b0) nq9VarB.e());
                    } else {
                        i3++;
                    }
                }
                pq9Var.x(i2, lq9Var);
                return;
            }
        }
    }

    public final void zzJ(zzh zzhVar, pq9 pq9Var) {
        zzaW().zzg();
        zzu();
        xp9 xp9VarO = s.O();
        byte[] bArrZzaJ = zzhVar.zzaJ();
        if (bArrZzaJ != null) {
            try {
                xp9VarO = (xp9) zzpk.zzw(xp9VarO, bArrZzaJ);
            } catch (com.google.android.gms.internal.measurement.zzmr unused) {
                zzaV().zze().zzb("Failed to parse locally stored ad campaign info. appId", zzgu.zzl(zzhVar.zzc()));
            }
        }
        for (z zVar : pq9Var.v()) {
            if (zVar.s().equals("_cmp")) {
                String str = (String) zzpk.zzJ(zVar, "gclid", "");
                String str2 = (String) zzpk.zzJ(zVar, "gbraid", "");
                String str3 = (String) zzpk.zzJ(zVar, "gad_source", "");
                String[] strArrSplit = ((String) zzfy.zzbg.zzb(null)).split(",");
                zzp();
                if (!zzpk.zzG(zVar, strArrSplit).isEmpty()) {
                    long jLongValue = ((Long) zzpk.zzJ(zVar, "click_timestamp", 0L)).longValue();
                    if (jLongValue <= 0) {
                        jLongValue = zVar.u();
                    }
                    if ("referrer API v2".equals(zzpk.zzI(zVar, "_cis"))) {
                        if (jLongValue > ((s) xp9VarO.b).N()) {
                            if (str.isEmpty()) {
                                xp9VarO.b();
                                ((s) xp9VarO.b).q();
                            } else {
                                xp9VarO.b();
                                ((s) xp9VarO.b).p(str);
                            }
                            if (str2.isEmpty()) {
                                xp9VarO.b();
                                ((s) xp9VarO.b).s();
                            } else {
                                xp9VarO.b();
                                ((s) xp9VarO.b).r(str2);
                            }
                            if (str3.isEmpty()) {
                                xp9VarO.b();
                                ((s) xp9VarO.b).u();
                            } else {
                                xp9VarO.b();
                                ((s) xp9VarO.b).t(str3);
                            }
                            xp9VarO.b();
                            ((s) xp9VarO.b).v(jLongValue);
                            xp9VarO.b();
                            ((s) xp9VarO.b).x().clear();
                            Map mapZzaD = zzaD(zVar);
                            xp9VarO.b();
                            ((s) xp9VarO.b).x().putAll(mapZzaD);
                        }
                    } else if (jLongValue > ((s) xp9VarO.b).F()) {
                        if (str.isEmpty()) {
                            xp9VarO.b();
                            ((s) xp9VarO.b).R();
                        } else {
                            xp9VarO.b();
                            ((s) xp9VarO.b).Q(str);
                        }
                        if (str2.isEmpty()) {
                            xp9VarO.b();
                            ((s) xp9VarO.b).T();
                        } else {
                            xp9VarO.b();
                            ((s) xp9VarO.b).S(str2);
                        }
                        if (str3.isEmpty()) {
                            xp9VarO.b();
                            ((s) xp9VarO.b).V();
                        } else {
                            xp9VarO.b();
                            ((s) xp9VarO.b).U(str3);
                        }
                        xp9VarO.b();
                        ((s) xp9VarO.b).W(jLongValue);
                        xp9VarO.b();
                        ((s) xp9VarO.b).w().clear();
                        Map mapZzaD2 = zzaD(zVar);
                        xp9VarO.b();
                        ((s) xp9VarO.b).w().putAll(mapZzaD2);
                    }
                }
            }
        }
        if (!((s) xp9VarO.e()).equals(s.P())) {
            s sVar = (s) xp9VarO.e();
            pq9Var.b();
            ((e0) pq9Var.b).m1(sVar);
        }
        zzhVar.zzaI(((s) xp9VarO.e()).a());
        if (zzhVar.zza()) {
            zzj().zzv(zzhVar, false, false);
        }
        if (zzd().zzp(null, zzfy.zzbf)) {
            zzj().zzk(zzhVar.zzc(), "_lgclid");
        }
    }

    public final String zzK(zzjl zzjlVar) {
        if (!zzjlVar.zzo(zzjk.ANALYTICS_STORAGE)) {
            return null;
        }
        byte[] bArr = new byte[16];
        zzt().zzf().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final void zzL(List list) {
        rq4.i(!list.isEmpty());
        if (this.zzz != null) {
            zzaV().zzb().zza("Set uploading progress before finishing the previous upload");
        } else {
            this.zzz = new ArrayList(list);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x01b7 A[Catch: all -> 0x002c, DONT_GENERATE, TRY_ENTER, TryCatch #6 {all -> 0x002c, blocks: (B:3:0x000e, B:5:0x001d, B:8:0x002f, B:10:0x0035, B:11:0x0044, B:13:0x004c, B:14:0x0051, B:16:0x005c, B:17:0x006b, B:19:0x0075, B:20:0x0087, B:22:0x00ab, B:24:0x00b1, B:25:0x00b4, B:27:0x00cd, B:28:0x00e4, B:30:0x00f4, B:32:0x00fa, B:35:0x010e, B:45:0x012c, B:47:0x0131, B:48:0x0134, B:49:0x0135, B:50:0x013a, B:60:0x017e, B:70:0x019c, B:72:0x01a2, B:74:0x01ac, B:78:0x01b7, B:79:0x01ba, B:33:0x00fe, B:37:0x0112, B:42:0x011a), top: B:89:0x000e, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[Catch: all -> 0x002c, SYNTHETIC, TRY_LEAVE, TryCatch #6 {all -> 0x002c, blocks: (B:3:0x000e, B:5:0x001d, B:8:0x002f, B:10:0x0035, B:11:0x0044, B:13:0x004c, B:14:0x0051, B:16:0x005c, B:17:0x006b, B:19:0x0075, B:20:0x0087, B:22:0x00ab, B:24:0x00b1, B:25:0x00b4, B:27:0x00cd, B:28:0x00e4, B:30:0x00f4, B:32:0x00fa, B:35:0x010e, B:45:0x012c, B:47:0x0131, B:48:0x0134, B:49:0x0135, B:50:0x013a, B:60:0x017e, B:70:0x019c, B:72:0x01a2, B:74:0x01ac, B:78:0x01b7, B:79:0x01ba, B:33:0x00fe, B:37:0x0112, B:42:0x011a), top: B:89:0x000e, inners: #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzM() {
        /*
            Method dump skipped, instruction units count: 449
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzpg.zzM():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00be, code lost:
    
        r22 = r10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0479 A[PHI: r10 r16 r23
      0x0479: PHI (r10v39 java.util.List) = (r10v75 java.util.List), (r10v76 java.util.List) binds: [B:184:0x049f, B:176:0x0477] A[DONT_GENERATE, DONT_INLINE]
      0x0479: PHI (r16v7 java.util.List) = (r16v18 java.util.List), (r16v19 java.util.List) binds: [B:184:0x049f, B:176:0x0477] A[DONT_GENERATE, DONT_INLINE]
      0x0479: PHI (r23v11 android.database.Cursor) = (r23v17 android.database.Cursor), (r23v21 android.database.Cursor) binds: [B:184:0x049f, B:176:0x0477] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006b A[PHI: r0 r10 r23
      0x006b: PHI (r0v120 java.util.List) = (r0v8 java.util.List), (r0v144 java.util.List) binds: [B:108:0x0231, B:16:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x006b: PHI (r10v57 android.database.Cursor) = (r10v5 android.database.Cursor), (r10v59 android.database.Cursor) binds: [B:108:0x0231, B:16:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x006b: PHI (r23v27 long) = (r23v32 long), (r23v31 long) binds: [B:108:0x0231, B:16:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0a9a  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0ae8  */
    /* JADX WARN: Removed duplicated region for block: B:475:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:476:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v17, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r23v19 */
    /* JADX WARN: Type inference failed for: r23v3, types: [long] */
    /* JADX WARN: Type inference failed for: r23v30 */
    /* JADX WARN: Type inference failed for: r23v35 */
    /* JADX WARN: Type inference failed for: r23v9 */
    /* JADX WARN: Type inference failed for: r32v0, types: [com.google.android.gms.measurement.internal.zzpg] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzN(java.lang.String r33, long r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2796
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzpg.zzN(java.lang.String, long):void");
    }

    public final boolean zzO(String str, String str2) {
        zzh zzhVarZzu = zzj().zzu(str);
        if (zzhVarZzu != null && zzt().zzaa(str, zzhVarZzu.zzay())) {
            this.zzF.remove(str2);
            return true;
        }
        zzpe zzpeVar = (zzpe) this.zzF.get(str2);
        if (zzpeVar == null) {
            return true;
        }
        return zzpeVar.zzb();
    }

    public final void zzP(String str) {
        d0 d0VarZzd;
        zzaW().zzg();
        zzu();
        this.zzw = true;
        try {
            zzic zzicVar = this.zzn;
            zzicVar.zzaU();
            Boolean boolZzJ = zzicVar.zzt().zzJ();
            if (boolZzJ == null) {
                zzaV().zze().zza("Upload data called on the client side before use of service was decided");
            } else if (boolZzJ.booleanValue()) {
                zzaV().zzb().zza("Upload called in the client side when service should be used");
            } else if (this.zza > 0) {
                zzaL();
            } else if (!zzi().zzb()) {
                zzaV().zzk().zza("Network not connected, ignoring upload request");
                zzaL();
            } else if (zzj().zzD(str)) {
                zzav zzavVarZzj = zzj();
                rq4.k(str);
                zzavVarZzj.zzg();
                zzavVarZzj.zzaw();
                List listZzC = zzavVarZzj.zzC(str, zzoo.zza(zzls.GOOGLE_SIGNAL), 1);
                zzpj zzpjVar = listZzC.isEmpty() ? null : (zzpj) listZzC.get(0);
                if (zzpjVar != null && (d0VarZzd = zzpjVar.zzd()) != null) {
                    zzaV().zzk().zzd("[sgtm] Uploading data from upload queue. appId, type, url", str, zzpjVar.zzf(), zzpjVar.zze());
                    byte[] bArrA = d0VarZzd.a();
                    if (Log.isLoggable(zzaV().zzn(), 2)) {
                        zzaV().zzk().zzd("[sgtm] Uploading data from upload queue. appId, uncompressed size, data", str, Integer.valueOf(bArrA.length), zzp().zzi(d0VarZzd));
                    }
                    zzot zzotVarZza = zzpjVar.zza();
                    this.zzv = true;
                    zzi().zzc(str, zzotVarZza, d0VarZzd, new zzox(this, str, zzpjVar));
                }
            } else {
                zzaV().zzk().zzb("[sgtm] Upload queue has no batches for appId", str);
            }
            this.zzw = false;
            zzaM();
        } catch (Throwable th) {
            this.zzw = false;
            zzaM();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001e A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:4:0x000d, B:19:0x005a, B:22:0x0080, B:13:0x001e, B:15:0x0048, B:17:0x0052, B:18:0x0056), top: B:27:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzQ(java.lang.String r4, int r5, java.lang.Throwable r6, byte[] r7, com.google.android.gms.measurement.internal.zzpj r8) {
        /*
            r3 = this;
            com.google.android.gms.measurement.internal.zzhz r0 = r3.zzaW()
            r0.zzg()
            r3.zzu()
            r0 = 0
            if (r7 != 0) goto L13
            byte[] r7 = new byte[r0]     // Catch: java.lang.Throwable -> L10
            goto L13
        L10:
            r4 = move-exception
            goto L9b
        L13:
            r1 = 200(0xc8, float:2.8E-43)
            if (r5 == r1) goto L1c
            r1 = 204(0xcc, float:2.86E-43)
            if (r5 != r1) goto L5a
            r5 = r1
        L1c:
            if (r6 != 0) goto L5a
            com.google.android.gms.measurement.internal.zzav r6 = r3.zzj()     // Catch: java.lang.Throwable -> L10
            long r7 = r8.zzc()     // Catch: java.lang.Throwable -> L10
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Throwable -> L10
            r6.zzE(r7)     // Catch: java.lang.Throwable -> L10
            com.google.android.gms.measurement.internal.zzgu r6 = r3.zzaV()     // Catch: java.lang.Throwable -> L10
            com.google.android.gms.measurement.internal.zzgs r6 = r6.zzk()     // Catch: java.lang.Throwable -> L10
            java.lang.String r7 = "Successfully uploaded batch from upload queue. appId, status"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L10
            r6.zzc(r7, r4, r5)     // Catch: java.lang.Throwable -> L10
            com.google.android.gms.measurement.internal.zzgz r5 = r3.zzi()     // Catch: java.lang.Throwable -> L10
            boolean r5 = r5.zzb()     // Catch: java.lang.Throwable -> L10
            if (r5 == 0) goto L56
            com.google.android.gms.measurement.internal.zzav r5 = r3.zzj()     // Catch: java.lang.Throwable -> L10
            boolean r5 = r5.zzD(r4)     // Catch: java.lang.Throwable -> L10
            if (r5 == 0) goto L56
            r3.zzP(r4)     // Catch: java.lang.Throwable -> L10
            goto L95
        L56:
            r3.zzaL()     // Catch: java.lang.Throwable -> L10
            goto L95
        L5a:
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Throwable -> L10
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L10
            r1.<init>(r7, r2)     // Catch: java.lang.Throwable -> L10
            int r7 = r1.length()     // Catch: java.lang.Throwable -> L10
            r2 = 32
            int r7 = java.lang.Math.min(r2, r7)     // Catch: java.lang.Throwable -> L10
            java.lang.String r7 = r1.substring(r0, r7)     // Catch: java.lang.Throwable -> L10
            com.google.android.gms.measurement.internal.zzgu r1 = r3.zzaV()     // Catch: java.lang.Throwable -> L10
            com.google.android.gms.measurement.internal.zzgs r1 = r1.zzh()     // Catch: java.lang.Throwable -> L10
            java.lang.String r2 = "Network upload failed. Will retry later. appId, status, error"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L10
            if (r6 != 0) goto L80
            r6 = r7
        L80:
            r1.zzd(r2, r4, r5, r6)     // Catch: java.lang.Throwable -> L10
            com.google.android.gms.measurement.internal.zzav r4 = r3.zzj()     // Catch: java.lang.Throwable -> L10
            long r5 = r8.zzc()     // Catch: java.lang.Throwable -> L10
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L10
            r4.zzK(r5)     // Catch: java.lang.Throwable -> L10
            r3.zzaL()     // Catch: java.lang.Throwable -> L10
        L95:
            r3.zzv = r0
            r3.zzaM()
            return
        L9b:
            r3.zzv = r0
            r3.zzaM()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzpg.zzQ(java.lang.String, int, java.lang.Throwable, byte[], com.google.android.gms.measurement.internal.zzpj):void");
    }

    public final void zzR(String str, boolean z, Long l, Long l2) {
        zzh zzhVarZzu = zzj().zzu(str);
        if (zzhVarZzu != null) {
            zzhVarZzu.zzar(z);
            zzhVarZzu.zzat(l);
            zzhVarZzu.zzav(l2);
            if (zzhVarZzu.zza()) {
                zzj().zzv(zzhVarZzu, false, false);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzS(java.lang.String r7, defpackage.pq9 r8) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzpg.zzS(java.lang.String, pq9):void");
    }

    public final void zzT(pq9 pq9Var, zzpc zzpcVar) {
        for (int i = 0; i < pq9Var.w(); i++) {
            lq9 lq9Var = (lq9) ((e0) pq9Var.b).V1(i).i();
            Iterator it = lq9Var.h().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if ("_c".equals(((b0) it.next()).q())) {
                    if (zzpcVar.zza.H0() >= zzd().zzm(zzpcVar.zza.p(), zzfy.zzal)) {
                        int iZzm = zzd().zzm(zzpcVar.zza.p(), zzfy.zzay);
                        String strZzaw = null;
                        if (iZzm <= 0) {
                            if (zzd().zzp(zzpcVar.zza.p(), zzfy.zzaR)) {
                                strZzaw = zzt().zzaw();
                                nq9 nq9VarB = b0.B();
                                nq9VarB.h("_tu");
                                nq9VarB.i(strZzaw);
                                lq9Var.k((b0) nq9VarB.e());
                            }
                            nq9 nq9VarB2 = b0.B();
                            nq9VarB2.h("_tr");
                            nq9VarB2.j(1L);
                            lq9Var.k((b0) nq9VarB2.e());
                            zzoh zzohVarZzf = zzp().zzf(zzpcVar.zza.p(), pq9Var, lq9Var, strZzaw);
                            if (zzohVarZzf != null) {
                                zzaV().zzk().zzc("Generated trigger URI. appId, uri", zzpcVar.zza.p(), zzohVarZzf.zza);
                                zzj().zzY(zzpcVar.zza.p(), zzohVarZzf);
                                Deque deque = this.zzr;
                                if (!deque.contains(zzpcVar.zza.p())) {
                                    deque.add(zzpcVar.zza.p());
                                }
                            }
                        } else if (zzj().zzw(zzC(), zzpcVar.zza.p(), false, false, false, false, false, false, true).zzg > iZzm) {
                            nq9 nq9VarB3 = b0.B();
                            nq9VarB3.h("_tnr");
                            nq9VarB3.j(1L);
                            lq9Var.k((b0) nq9VarB3.e());
                        } else {
                            if (zzd().zzp(zzpcVar.zza.p(), zzfy.zzaR)) {
                                strZzaw = zzt().zzaw();
                                nq9 nq9VarB4 = b0.B();
                                nq9VarB4.h("_tu");
                                nq9VarB4.i(strZzaw);
                                lq9Var.k((b0) nq9VarB4.e());
                            }
                            nq9 nq9VarB5 = b0.B();
                            nq9VarB5.h("_tr");
                            nq9VarB5.j(1L);
                            lq9Var.k((b0) nq9VarB5.e());
                            zzoh zzohVarZzf2 = zzp().zzf(zzpcVar.zza.p(), pq9Var, lq9Var, strZzaw);
                            if (zzohVarZzf2 != null) {
                                zzaV().zzk().zzc("Generated trigger URI. appId, uri", zzpcVar.zza.p(), zzohVarZzf2.zza);
                                zzj().zzY(zzpcVar.zza.p(), zzohVarZzf2);
                                Deque deque2 = this.zzr;
                                if (!deque2.contains(zzpcVar.zza.p())) {
                                    deque2.add(zzpcVar.zza.p());
                                }
                            }
                        }
                    }
                    z zVar = (z) lq9Var.e();
                    pq9Var.b();
                    ((e0) pq9Var.b).X(i, zVar);
                }
            }
        }
    }

    public final void zzU(String str, nq9 nq9Var, Bundle bundle, String str2) {
        List listUnmodifiableList = DesugarCollections.unmodifiableList(Arrays.asList("_o", "_sn", "_sc", "_si"));
        long jZzf = (zzpp.zzZ(((b0) nq9Var.b).q()) || zzpp.zzZ(str)) ? zzd().zzf(str2, true) : zzd().zze(str2, true);
        long jCodePointCount = ((b0) nq9Var.b).s().codePointCount(0, ((b0) nq9Var.b).s().length());
        zzpp zzppVarZzt = zzt();
        String strQ = ((b0) nq9Var.b).q();
        zzd();
        String strZzC = zzppVarZzt.zzC(strQ, 40, true);
        if (jCodePointCount <= jZzf || listUnmodifiableList.contains(((b0) nq9Var.b).q())) {
            return;
        }
        if ("_ev".equals(((b0) nq9Var.b).q())) {
            bundle.putString("_ev", zzt().zzC(((b0) nq9Var.b).s(), zzd().zzf(str2, true), true));
            return;
        }
        zzaV().zzh().zzc("Param value is too long; discarded. Name, value length", strZzC, Long.valueOf(jCodePointCount));
        if (bundle.getLong("_err") == 0) {
            bundle.putLong("_err", 4L);
            if (bundle.getString("_ev") == null) {
                bundle.putString("_ev", strZzC);
                bundle.putLong("_el", jCodePointCount);
            }
        }
        bundle.remove(((b0) nq9Var.b).q());
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0072 A[Catch: all -> 0x0016, TryCatch #1 {all -> 0x0016, blocks: (B:4:0x0013, B:8:0x001b, B:16:0x0030, B:21:0x0086, B:20:0x0072, B:22:0x0092, B:24:0x00a9, B:27:0x00c1, B:29:0x00cf, B:31:0x00ef, B:73:0x022f, B:75:0x0242, B:77:0x024c, B:85:0x026c, B:79:0x0252, B:81:0x025c, B:83:0x0262, B:84:0x0266, B:86:0x026f, B:87:0x0276, B:30:0x00e2, B:88:0x0277), top: B:94:0x0013, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0092 A[Catch: all -> 0x0016, PHI: r0
      0x0092: PHI (r0v2 int) = (r0v0 int), (r0v39 int) binds: [B:9:0x0023, B:15:0x002e] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #1 {all -> 0x0016, blocks: (B:4:0x0013, B:8:0x001b, B:16:0x0030, B:21:0x0086, B:20:0x0072, B:22:0x0092, B:24:0x00a9, B:27:0x00c1, B:29:0x00cf, B:31:0x00ef, B:73:0x022f, B:75:0x0242, B:77:0x024c, B:85:0x026c, B:79:0x0252, B:81:0x025c, B:83:0x0262, B:84:0x0266, B:86:0x026f, B:87:0x0276, B:30:0x00e2, B:88:0x0277), top: B:94:0x0013, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cf A[Catch: all -> 0x0016, SQLiteException -> 0x00be, TryCatch #3 {SQLiteException -> 0x00be, blocks: (B:24:0x00a9, B:27:0x00c1, B:29:0x00cf, B:31:0x00ef, B:73:0x022f, B:75:0x0242, B:77:0x024c, B:85:0x026c, B:79:0x0252, B:81:0x025c, B:83:0x0262, B:84:0x0266, B:86:0x026f, B:87:0x0276, B:30:0x00e2), top: B:97:0x00a9, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e2 A[Catch: all -> 0x0016, SQLiteException -> 0x00be, TryCatch #3 {SQLiteException -> 0x00be, blocks: (B:24:0x00a9, B:27:0x00c1, B:29:0x00cf, B:31:0x00ef, B:73:0x022f, B:75:0x0242, B:77:0x024c, B:85:0x026c, B:79:0x0252, B:81:0x025c, B:83:0x0262, B:84:0x0266, B:86:0x026f, B:87:0x0276, B:30:0x00e2), top: B:97:0x00a9, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0107 A[Catch: all -> 0x0160, TryCatch #0 {all -> 0x0160, blocks: (B:32:0x00f6, B:33:0x00ff, B:35:0x0107, B:37:0x011e, B:41:0x0148, B:43:0x0152, B:47:0x0163, B:48:0x0168, B:50:0x016e, B:52:0x0185, B:54:0x01aa, B:56:0x01c5, B:58:0x01ed, B:59:0x01fe, B:60:0x0202, B:62:0x0208, B:63:0x020f, B:66:0x021c, B:68:0x0220, B:71:0x0227, B:72:0x0228), top: B:93:0x00f6, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x016e A[Catch: all -> 0x0160, TryCatch #0 {all -> 0x0160, blocks: (B:32:0x00f6, B:33:0x00ff, B:35:0x0107, B:37:0x011e, B:41:0x0148, B:43:0x0152, B:47:0x0163, B:48:0x0168, B:50:0x016e, B:52:0x0185, B:54:0x01aa, B:56:0x01c5, B:58:0x01ed, B:59:0x01fe, B:60:0x0202, B:62:0x0208, B:63:0x020f, B:66:0x021c, B:68:0x0220, B:71:0x0227, B:72:0x0228), top: B:93:0x00f6, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01c5 A[Catch: all -> 0x0160, TryCatch #0 {all -> 0x0160, blocks: (B:32:0x00f6, B:33:0x00ff, B:35:0x0107, B:37:0x011e, B:41:0x0148, B:43:0x0152, B:47:0x0163, B:48:0x0168, B:50:0x016e, B:52:0x0185, B:54:0x01aa, B:56:0x01c5, B:58:0x01ed, B:59:0x01fe, B:60:0x0202, B:62:0x0208, B:63:0x020f, B:66:0x021c, B:68:0x0220, B:71:0x0227, B:72:0x0228), top: B:93:0x00f6, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0208 A[Catch: all -> 0x0160, TRY_LEAVE, TryCatch #0 {all -> 0x0160, blocks: (B:32:0x00f6, B:33:0x00ff, B:35:0x0107, B:37:0x011e, B:41:0x0148, B:43:0x0152, B:47:0x0163, B:48:0x0168, B:50:0x016e, B:52:0x0185, B:54:0x01aa, B:56:0x01c5, B:58:0x01ed, B:59:0x01fe, B:60:0x0202, B:62:0x0208, B:63:0x020f, B:66:0x021c, B:68:0x0220, B:71:0x0227, B:72:0x0228), top: B:93:0x00f6, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0252 A[Catch: all -> 0x0016, SQLiteException -> 0x00be, TryCatch #3 {SQLiteException -> 0x00be, blocks: (B:24:0x00a9, B:27:0x00c1, B:29:0x00cf, B:31:0x00ef, B:73:0x022f, B:75:0x0242, B:77:0x024c, B:85:0x026c, B:79:0x0252, B:81:0x025c, B:83:0x0262, B:84:0x0266, B:86:0x026f, B:87:0x0276, B:30:0x00e2), top: B:97:0x00a9, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0266 A[Catch: all -> 0x0016, SQLiteException -> 0x00be, TryCatch #3 {SQLiteException -> 0x00be, blocks: (B:24:0x00a9, B:27:0x00c1, B:29:0x00cf, B:31:0x00ef, B:73:0x022f, B:75:0x0242, B:77:0x024c, B:85:0x026c, B:79:0x0252, B:81:0x025c, B:83:0x0262, B:84:0x0266, B:86:0x026f, B:87:0x0276, B:30:0x00e2), top: B:97:0x00a9, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzV(boolean r19, int r20, java.lang.Throwable r21, byte[] r22, java.lang.String r23, java.util.List r24) {
        /*
            Method dump skipped, instruction units count: 690
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzpg.zzV(boolean, int, java.lang.Throwable, byte[], java.lang.String, java.util.List):void");
    }

    public final void zzW(zzh zzhVar) {
        zzaW().zzg();
        if (TextUtils.isEmpty(zzhVar.zzf())) {
            String strZzc = zzhVar.zzc();
            rq4.n(strZzc);
            zzX(strZzc, 204, null, null, null);
            return;
        }
        String strZzc2 = zzhVar.zzc();
        rq4.n(strZzc2);
        zzaV().zzk().zzb("Fetching remote configuration", strZzc2);
        m mVarZzb = zzh().zzb(strZzc2);
        String strZzd = zzh().zzd(strZzc2);
        wv wvVar = null;
        if (mVarZzb != null) {
            if (!TextUtils.isEmpty(strZzd)) {
                wvVar = new wv(0);
                wvVar.put("If-Modified-Since", strZzd);
            }
            String strZze = zzh().zze(strZzc2);
            if (!TextUtils.isEmpty(strZze)) {
                if (wvVar == null) {
                    wvVar = new wv(0);
                }
                wvVar.put("If-None-Match", strZze);
            }
        }
        this.zzu = true;
        zzi().zzd(zzhVar, wvVar, new zzgw() { // from class: com.google.android.gms.measurement.internal.zzpf
            @Override // com.google.android.gms.measurement.internal.zzgw
            public final /* synthetic */ void zza(String str, int i, Throwable th, byte[] bArr, Map map) {
                this.zza.zzX(str, i, th, bArr, map);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzX(java.lang.String r7, int r8, java.lang.Throwable r9, byte[] r10, java.util.Map r11) {
        /*
            Method dump skipped, instruction units count: 393
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzpg.zzX(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    public final void zzY(Runnable runnable) {
        zzaW().zzg();
        if (this.zzq == null) {
            this.zzq = new ArrayList();
        }
        this.zzq.add(runnable);
    }

    public final void zzZ() {
        zzaW().zzg();
        zzu();
        if (this.zzp) {
            return;
        }
        this.zzp = true;
        if (zzaa()) {
            FileChannel fileChannel = this.zzy;
            zzaW().zzg();
            int i = 0;
            if (fileChannel == null || !fileChannel.isOpen()) {
                zzaV().zzb().zza("Bad channel to read from");
            } else {
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
                try {
                    fileChannel.position(0L);
                    int i2 = fileChannel.read(byteBufferAllocate);
                    if (i2 == 4) {
                        byteBufferAllocate.flip();
                        i = byteBufferAllocate.getInt();
                    } else if (i2 != -1) {
                        zzaV().zze().zzb("Unexpected data length. Bytes read", Integer.valueOf(i2));
                    }
                } catch (IOException e) {
                    zzaV().zzb().zzb("Failed to read from channel", e);
                }
            }
            int iZzm = this.zzn.zzv().zzm();
            zzaW().zzg();
            if (i > iZzm) {
                zzaV().zzb().zzc("Panic: can't downgrade version. Previous, current version", Integer.valueOf(i), Integer.valueOf(iZzm));
                return;
            }
            if (i < iZzm) {
                FileChannel fileChannel2 = this.zzy;
                zzaW().zzg();
                if (fileChannel2 == null || !fileChannel2.isOpen()) {
                    zzaV().zzb().zza("Bad channel to read from");
                } else {
                    ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(4);
                    byteBufferAllocate2.putInt(iZzm);
                    byteBufferAllocate2.flip();
                    try {
                        fileChannel2.truncate(0L);
                        fileChannel2.write(byteBufferAllocate2);
                        fileChannel2.force(true);
                        if (fileChannel2.size() != 4) {
                            zzaV().zzb().zzb("Error writing to channel. Bytes written", Long.valueOf(fileChannel2.size()));
                        }
                        zzaV().zzk().zzc("Storage version upgraded. Previous, current version", Integer.valueOf(i), Integer.valueOf(iZzm));
                        return;
                    } catch (IOException e2) {
                        zzaV().zzb().zzb("Failed to write to channel", e2);
                    }
                }
                zzaV().zzb().zzc("Storage version upgrade failed. Previous, current version", Integer.valueOf(i), Integer.valueOf(iZzm));
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzjg
    public final zzae zzaU() {
        return this.zzn.zzaU();
    }

    @Override // com.google.android.gms.measurement.internal.zzjg
    public final zzgu zzaV() {
        zzic zzicVar = this.zzn;
        rq4.n(zzicVar);
        return zzicVar.zzaV();
    }

    @Override // com.google.android.gms.measurement.internal.zzjg
    public final zzhz zzaW() {
        zzic zzicVar = this.zzn;
        rq4.n(zzicVar);
        return zzicVar.zzaW();
    }

    @Override // com.google.android.gms.measurement.internal.zzjg
    public final Context zzaY() {
        return this.zzn.zzaY();
    }

    @Override // com.google.android.gms.measurement.internal.zzjg
    public final xt0 zzaZ() {
        zzic zzicVar = this.zzn;
        rq4.n(zzicVar);
        return zzicVar.zzaZ();
    }

    public final boolean zzaa() {
        zzaW().zzg();
        FileLock fileLock = this.zzx;
        if (fileLock != null && fileLock.isValid()) {
            zzaV().zzk().zza("Storage concurrent access okay");
            return true;
        }
        this.zze.zzu.zzc();
        try {
            FileChannel channel = new RandomAccessFile(new File(new File(this.zzn.zzaY().getFilesDir(), "google_app_measurement.db").getPath()), "rw").getChannel();
            this.zzy = channel;
            FileLock fileLockTryLock = channel.tryLock();
            this.zzx = fileLockTryLock;
            if (fileLockTryLock != null) {
                zzaV().zzk().zza("Storage concurrent access okay");
                return true;
            }
            zzaV().zzb().zza("Storage concurrent data access panic");
            return false;
        } catch (FileNotFoundException e) {
            zzaV().zzb().zzb("Failed to acquire storage lock", e);
            return false;
        } catch (IOException e2) {
            zzaV().zzb().zzb("Failed to access storage lock file", e2);
            return false;
        } catch (OverlappingFileLockException e3) {
            zzaV().zze().zzb("Storage lock already acquired", e3);
            return false;
        }
    }

    public final void zzab(zzr zzrVar) {
        if (this.zzz != null) {
            ArrayList arrayList = new ArrayList();
            this.zzA = arrayList;
            arrayList.addAll(this.zzz);
        }
        zzav zzavVarZzj = zzj();
        String str = zzrVar.zza;
        rq4.n(str);
        rq4.k(str);
        zzavVarZzj.zzg();
        zzavVarZzj.zzaw();
        try {
            SQLiteDatabase sQLiteDatabaseZze = zzavVarZzj.zze();
            String[] strArr = {str};
            int iDelete = sQLiteDatabaseZze.delete("apps", "app_id=?", strArr) + sQLiteDatabaseZze.delete("events", "app_id=?", strArr) + sQLiteDatabaseZze.delete("events_snapshot", "app_id=?", strArr) + sQLiteDatabaseZze.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseZze.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseZze.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseZze.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseZze.delete("queue", "app_id=?", strArr) + sQLiteDatabaseZze.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseZze.delete("main_event_params", "app_id=?", strArr) + sQLiteDatabaseZze.delete("default_event_params", "app_id=?", strArr) + sQLiteDatabaseZze.delete("trigger_uris", "app_id=?", strArr) + sQLiteDatabaseZze.delete("upload_queue", "app_id=?", strArr);
            ((uu9) tu9.b.a.get()).getClass();
            zzic zzicVar = zzavVarZzj.zzu;
            if (zzicVar.zzc().zzp(null, zzfy.zzbh)) {
                iDelete += sQLiteDatabaseZze.delete("no_data_mode_events", "app_id=?", strArr);
            }
            if (iDelete > 0) {
                zzicVar.zzaV().zzk().zzc("Reset analytics data. app, records", str, Integer.valueOf(iDelete));
            }
        } catch (SQLiteException e) {
            zzavVarZzj.zzu.zzaV().zzb().zzc("Error resetting analytics data. appId, error", zzgu.zzl(str), e);
        }
        if (zzrVar.zzh) {
            zzah(zzrVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzac(com.google.android.gms.measurement.internal.zzpl r22, com.google.android.gms.measurement.internal.zzr r23) {
        /*
            Method dump skipped, instruction units count: 487
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzpg.zzac(com.google.android.gms.measurement.internal.zzpl, com.google.android.gms.measurement.internal.zzr):void");
    }

    public final void zzad(String str, zzr zzrVar) {
        zzaW().zzg();
        zzu();
        if (zzaR(zzrVar)) {
            if (!zzrVar.zzh) {
                zzao(zzrVar);
                return;
            }
            Boolean boolZzaT = zzaT(zzrVar);
            if ("_npa".equals(str) && boolZzaT != null) {
                zzaV().zzj().zza("Falling back to manifest metadata value for ad personalization");
                ((eq) zzaZ()).getClass();
                zzac(new zzpl("_npa", System.currentTimeMillis(), Long.valueOf(true != boolZzaT.booleanValue() ? 0L : 1L), "auto"), zzrVar);
                return;
            }
            zzgs zzgsVarZzj = zzaV().zzj();
            zzic zzicVar = this.zzn;
            zzgsVarZzj.zzb("Removing user property", zzicVar.zzl().zzc(str));
            zzj().zzb();
            try {
                zzao(zzrVar);
                if (FieldType.FOREIGN_ID_FIELD_SUFFIX.equals(str)) {
                    zzav zzavVarZzj = zzj();
                    String str2 = zzrVar.zza;
                    rq4.n(str2);
                    zzavVarZzj.zzk(str2, "_lair");
                }
                zzav zzavVarZzj2 = zzj();
                String str3 = zzrVar.zza;
                rq4.n(str3);
                zzavVarZzj2.zzk(str3, str);
                zzj().zzc();
                zzaV().zzj().zzb("User property removed", zzicVar.zzl().zzc(str));
                zzj().zzd();
            } catch (Throwable th) {
                zzj().zzd();
                throw th;
            }
        }
    }

    public final void zzae() {
        this.zzs++;
    }

    public final void zzaf() {
        this.zzt++;
    }

    public final zzic zzag() {
        return this.zzn;
    }

    public final void zzah(zzr zzrVar) {
        long j;
        long j2;
        zzbc zzbcVarZzf;
        boolean z;
        String str;
        PackageInfo packageInfoC;
        ApplicationInfo applicationInfoB;
        long j3;
        boolean z2;
        zzaW().zzg();
        zzu();
        rq4.n(zzrVar);
        String str2 = zzrVar.zza;
        rq4.k(str2);
        if (zzaR(zzrVar)) {
            zzh zzhVarZzu = zzj().zzu(str2);
            if (zzhVarZzu != null && TextUtils.isEmpty(zzhVarZzu.zzf()) && !TextUtils.isEmpty(zzrVar.zzb)) {
                zzhVarZzu.zzI(0L);
                zzj().zzv(zzhVarZzu, false, false);
                zzh().zzh(str2);
            }
            if (!zzrVar.zzh) {
                zzao(zzrVar);
                return;
            }
            long jCurrentTimeMillis = zzrVar.zzl;
            if (jCurrentTimeMillis == 0) {
                ((eq) zzaZ()).getClass();
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            long j4 = jCurrentTimeMillis;
            int i = zzrVar.zzm;
            if (i != 0 && i != 1) {
                zzaV().zze().zzc("Incorrect app type, assuming installed app. appId, appType", zzgu.zzl(str2), Integer.valueOf(i));
                i = 0;
            }
            zzj().zzb();
            try {
                zzpn zzpnVarZzm = zzj().zzm(str2, "_npa");
                Boolean boolZzaT = zzaT(zzrVar);
                if (zzpnVarZzm != null && !"auto".equals(zzpnVarZzm.zzb)) {
                    j = j4;
                    j2 = 1;
                } else if (boolZzaT != null) {
                    zzpl zzplVar = new zzpl("_npa", j4, Long.valueOf(true != boolZzaT.booleanValue() ? 0L : 1L), "auto");
                    j2 = 1;
                    j = j4;
                    if (zzpnVarZzm == null || !zzpnVarZzm.zze.equals(zzplVar.zzd)) {
                        zzac(zzplVar, zzrVar);
                    }
                } else {
                    j = j4;
                    j2 = 1;
                    if (zzpnVarZzm != null) {
                        zzad("_npa", zzrVar);
                    }
                }
                if (zzd().zzp(null, zzfy.zzbb)) {
                    zzan(zzrVar, zzrVar.zzD);
                } else {
                    zzan(zzrVar, j);
                }
                zzao(zzrVar);
                if (i == 0) {
                    zzbcVarZzf = zzj().zzf(str2, "_f");
                    z = false;
                } else {
                    zzbcVarZzf = zzj().zzf(str2, "_v");
                    z = true;
                }
                if (zzbcVarZzf == null) {
                    long j5 = ((j / 3600000) + j2) * 3600000;
                    if (z) {
                        long j6 = j;
                        zzac(new zzpl("_fvt", j6, Long.valueOf(j5), "auto"), zzrVar);
                        zzaW().zzg();
                        zzu();
                        Bundle bundle = new Bundle();
                        bundle.putLong("_c", 1L);
                        bundle.putLong("_r", 1L);
                        bundle.putLong("_et", 1L);
                        if (zzrVar.zzo) {
                            bundle.putLong("_dac", 1L);
                        }
                        if (zzd().zzp(null, zzfy.zzbj)) {
                            ((eq) zzaZ()).getClass();
                            bundle.putLong("_elt", System.currentTimeMillis());
                        }
                        zzE(new zzbg("_v", new zzbe(bundle), "auto", j6), zzrVar);
                    } else {
                        Long lValueOf = Long.valueOf(j5);
                        long j7 = j;
                        zzac(new zzpl("_fot", j7, lValueOf, "auto"), zzrVar);
                        zzaW().zzg();
                        zzhk zzhkVar = this.zzm;
                        rq4.n(zzhkVar);
                        if (str2 == null || str2.isEmpty()) {
                            str = "_elt";
                            zzhkVar.zza.zzaV().zzf().zza("Install Referrer Reporter was called with invalid app package name");
                        } else {
                            zzic zzicVar = zzhkVar.zza;
                            zzicVar.zzaW().zzg();
                            if (zzhkVar.zza()) {
                                zzhj zzhjVar = new zzhj(zzhkVar, str2);
                                zzicVar.zzaW().zzg();
                                Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
                                str = "_elt";
                                intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
                                PackageManager packageManager = zzicVar.zzaY().getPackageManager();
                                if (packageManager == null) {
                                    zzicVar.zzaV().zzf().zza("Failed to obtain Package Manager to verify binding conditions for Install Referrer");
                                } else {
                                    List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
                                    if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                                        zzicVar.zzaV().zzi().zza("Play Service for fetching Install Referrer is unavailable on device");
                                    } else {
                                        ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                                        if (serviceInfo != null) {
                                            String str3 = serviceInfo.packageName;
                                            if (serviceInfo.name != null && "com.android.vending".equals(str3) && zzhkVar.zza()) {
                                                try {
                                                    zzicVar.zzaV().zzk().zzb("Install Referrer Service is", b21.b().a(zzicVar.zzaY(), new Intent(intent), zzhjVar, 1) ? "available" : "not available");
                                                } catch (RuntimeException e) {
                                                    zzhkVar.zza.zzaV().zzb().zzb("Exception occurred while binding to Install Referrer Service", e.getMessage());
                                                }
                                            } else {
                                                zzicVar.zzaV().zze().zza("Play Store version 8.3.73 or higher required for Install Referrer");
                                            }
                                        }
                                    }
                                }
                            } else {
                                zzicVar.zzaV().zzi().zza("Install Referrer Reporter is not available");
                                str = "_elt";
                            }
                        }
                        zzaW().zzg();
                        zzu();
                        Bundle bundle2 = new Bundle();
                        long j8 = j2;
                        bundle2.putLong("_c", j8);
                        bundle2.putLong("_r", j8);
                        bundle2.putLong("_uwa", 0L);
                        bundle2.putLong("_pfo", 0L);
                        bundle2.putLong("_sys", 0L);
                        bundle2.putLong("_sysu", 0L);
                        bundle2.putLong("_et", j8);
                        if (zzrVar.zzo) {
                            bundle2.putLong("_dac", j8);
                        }
                        String str4 = zzrVar.zza;
                        rq4.n(str4);
                        zzav zzavVarZzj = zzj();
                        rq4.k(str4);
                        zzavVarZzj.zzg();
                        zzavVarZzj.zzaw();
                        long jZzN = zzavVarZzj.zzN(str4, "first_open_count");
                        zzic zzicVar2 = this.zzn;
                        if (zzicVar2.zzaY().getPackageManager() == null) {
                            zzaV().zzb().zzb("PackageManager is null, first open report might be inaccurate. appId", zzgu.zzl(str4));
                        } else {
                            try {
                                packageInfoC = sg9.a(zzicVar2.zzaY()).c(0, str4);
                            } catch (PackageManager.NameNotFoundException e2) {
                                zzaV().zzb().zzc("Package info is null, first open report might be inaccurate. appId", zzgu.zzl(str4), e2);
                                packageInfoC = null;
                            }
                            if (packageInfoC != null) {
                                long j9 = packageInfoC.firstInstallTime;
                                if (j9 != 0) {
                                    if (j9 != packageInfoC.lastUpdateTime) {
                                        if (!zzd().zzp(null, zzfy.zzaI)) {
                                            bundle2.putLong("_uwa", 1L);
                                        } else if (jZzN == 0) {
                                            bundle2.putLong("_uwa", 1L);
                                            jZzN = 0;
                                        }
                                        z2 = false;
                                    } else {
                                        z2 = true;
                                    }
                                    zzac(new zzpl("_fi", j7, Long.valueOf(true != z2 ? 0L : 1L), "auto"), zzrVar);
                                }
                            }
                            try {
                                applicationInfoB = sg9.a(this.zzn.zzaY()).b(0, str4);
                            } catch (PackageManager.NameNotFoundException e3) {
                                zzaV().zzb().zzc("Application info is null, first open report might be inaccurate. appId", zzgu.zzl(str4), e3);
                                applicationInfoB = null;
                            }
                            if (applicationInfoB != null) {
                                if ((applicationInfoB.flags & 1) != 0) {
                                    j3 = 1;
                                    bundle2.putLong("_sys", 1L);
                                } else {
                                    j3 = 1;
                                }
                                if ((applicationInfoB.flags & 128) != 0) {
                                    bundle2.putLong("_sysu", j3);
                                }
                            }
                        }
                        if (jZzN >= 0) {
                            bundle2.putLong("_pfo", jZzN);
                        }
                        if (zzd().zzp(null, zzfy.zzbj)) {
                            ((eq) zzaZ()).getClass();
                            bundle2.putLong(str, System.currentTimeMillis());
                        }
                        zzE(new zzbg("_f", new zzbe(bundle2), "auto", j7), zzrVar);
                    }
                } else {
                    long j10 = j;
                    if (zzrVar.zzi) {
                        zzE(new zzbg("_cd", new zzbe(new Bundle()), "auto", j10), zzrVar);
                    }
                }
                zzj().zzc();
                zzj().zzd();
            } catch (Throwable th) {
                zzj().zzd();
                throw th;
            }
        }
    }

    public final void zzai(zzr zzrVar) throws Throwable {
        zzaW().zzg();
        zzu();
        rq4.n(zzrVar);
        String str = zzrVar.zza;
        rq4.k(str);
        int i = 0;
        if (zzd().zzp(null, zzfy.zzaz)) {
            ((eq) zzaZ()).getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            int iZzm = zzd().zzm(null, zzfy.zzai);
            zzd();
            long jZzF = jCurrentTimeMillis - zzal.zzF();
            while (i < iZzm && zzaG(null, jZzF)) {
                i++;
            }
        } else {
            zzd();
            long jZzH = zzal.zzH();
            while (i < jZzH && zzaG(str, 0L)) {
                i++;
            }
        }
        if (zzd().zzp(null, zzfy.zzaA)) {
            zzaW().zzg();
            zzav();
        }
        if (this.zzl.zzc(str, com.google.android.gms.internal.measurement.zzin.a(zzrVar.zzE))) {
            zzaV().zzk().zzb("[sgtm] Going background, trigger client side upload. appId", str);
            ((eq) zzaZ()).getClass();
            zzN(str, System.currentTimeMillis());
        }
    }

    public final void zzaj(zzah zzahVar) {
        String str = zzahVar.zza;
        rq4.n(str);
        zzr zzrVarZzaO = zzaO(str);
        if (zzrVarZzaO != null) {
            zzak(zzahVar, zzrVarZzaO);
        }
    }

    public final void zzak(zzah zzahVar, zzr zzrVar) {
        rq4.n(zzahVar);
        rq4.k(zzahVar.zza);
        rq4.n(zzahVar.zzb);
        rq4.n(zzahVar.zzc);
        rq4.k(zzahVar.zzc.zzb);
        zzaW().zzg();
        zzu();
        if (zzaR(zzrVar)) {
            if (!zzrVar.zzh) {
                zzao(zzrVar);
                return;
            }
            zzah zzahVar2 = new zzah(zzahVar);
            boolean z = false;
            zzahVar2.zze = false;
            zzj().zzb();
            try {
                zzav zzavVarZzj = zzj();
                String str = zzahVar2.zza;
                rq4.n(str);
                zzah zzahVarZzq = zzavVarZzj.zzq(str, zzahVar2.zzc.zzb);
                if (zzahVarZzq != null && !zzahVarZzq.zzb.equals(zzahVar2.zzb)) {
                    zzaV().zze().zzd("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.zzn.zzl().zzc(zzahVar2.zzc.zzb), zzahVar2.zzb, zzahVarZzq.zzb);
                }
                if (zzahVarZzq != null && zzahVarZzq.zze) {
                    zzahVar2.zzb = zzahVarZzq.zzb;
                    zzahVar2.zzd = zzahVarZzq.zzd;
                    zzahVar2.zzh = zzahVarZzq.zzh;
                    zzahVar2.zzf = zzahVarZzq.zzf;
                    zzahVar2.zzi = zzahVarZzq.zzi;
                    zzahVar2.zze = true;
                    zzpl zzplVar = zzahVar2.zzc;
                    zzahVar2.zzc = new zzpl(zzplVar.zzb, zzahVarZzq.zzc.zzc, zzplVar.zza(), zzahVarZzq.zzc.zzf);
                } else if (TextUtils.isEmpty(zzahVar2.zzf)) {
                    zzpl zzplVar2 = zzahVar2.zzc;
                    zzahVar2.zzc = new zzpl(zzplVar2.zzb, zzahVar2.zzd, zzplVar2.zza(), zzahVar2.zzc.zzf);
                    zzahVar2.zze = true;
                    z = true;
                }
                if (zzahVar2.zze) {
                    zzpl zzplVar3 = zzahVar2.zzc;
                    String str2 = zzahVar2.zza;
                    rq4.n(str2);
                    String str3 = zzahVar2.zzb;
                    String str4 = zzplVar3.zzb;
                    long j = zzplVar3.zzc;
                    Object objZza = zzplVar3.zza();
                    rq4.n(objZza);
                    zzpn zzpnVar = new zzpn(str2, str3, str4, j, objZza);
                    if (zzj().zzl(zzpnVar)) {
                        zzaV().zzj().zzd("User property updated immediately", zzahVar2.zza, this.zzn.zzl().zzc(zzpnVar.zzc), zzpnVar.zze);
                    } else {
                        zzaV().zzb().zzd("(2)Too many active user properties, ignoring", zzgu.zzl(zzahVar2.zza), this.zzn.zzl().zzc(zzpnVar.zzc), zzpnVar.zze);
                    }
                    if (z && zzahVar2.zzi != null) {
                        zzH(new zzbg(zzahVar2.zzi, zzahVar2.zzd), zzrVar);
                    }
                }
                if (zzj().zzp(zzahVar2)) {
                    zzaV().zzj().zzd("Conditional property added", zzahVar2.zza, this.zzn.zzl().zzc(zzahVar2.zzc.zzb), zzahVar2.zzc.zza());
                } else {
                    zzaV().zzb().zzd("Too many conditional properties, ignoring", zzgu.zzl(zzahVar2.zza), this.zzn.zzl().zzc(zzahVar2.zzc.zzb), zzahVar2.zzc.zza());
                }
                zzj().zzc();
                zzj().zzd();
            } catch (Throwable th) {
                zzj().zzd();
                throw th;
            }
        }
    }

    public final void zzal(zzah zzahVar) {
        String str = zzahVar.zza;
        rq4.n(str);
        zzr zzrVarZzaO = zzaO(str);
        if (zzrVarZzaO != null) {
            zzam(zzahVar, zzrVarZzaO);
        }
    }

    public final void zzam(zzah zzahVar, zzr zzrVar) {
        rq4.n(zzahVar);
        rq4.k(zzahVar.zza);
        rq4.n(zzahVar.zzc);
        rq4.k(zzahVar.zzc.zzb);
        zzaW().zzg();
        zzu();
        if (zzaR(zzrVar)) {
            if (!zzrVar.zzh) {
                zzao(zzrVar);
                return;
            }
            zzj().zzb();
            try {
                zzao(zzrVar);
                String str = zzahVar.zza;
                rq4.n(str);
                zzah zzahVarZzq = zzj().zzq(str, zzahVar.zzc.zzb);
                if (zzahVarZzq != null) {
                    zzaV().zzj().zzc("Removing conditional user property", zzahVar.zza, this.zzn.zzl().zzc(zzahVar.zzc.zzb));
                    zzj().zzr(str, zzahVar.zzc.zzb);
                    if (zzahVarZzq.zze) {
                        zzj().zzk(str, zzahVar.zzc.zzb);
                    }
                    zzbg zzbgVar = zzahVar.zzk;
                    if (zzbgVar != null) {
                        zzbe zzbeVar = zzbgVar.zzb;
                        zzbg zzbgVarZzac = zzt().zzac(str, zzbgVar.zza, zzbeVar != null ? zzbeVar.zzf() : null, zzahVarZzq.zzb, zzbgVar.zzd, true, true);
                        rq4.n(zzbgVarZzac);
                        zzH(zzbgVarZzac, zzrVar);
                    }
                } else {
                    zzaV().zze().zzc("Conditional user property doesn't exist", zzgu.zzl(zzahVar.zza), this.zzn.zzl().zzc(zzahVar.zzc.zzb));
                }
                zzj().zzc();
                zzj().zzd();
            } catch (Throwable th) {
                zzj().zzd();
                throw th;
            }
        }
    }

    public final void zzan(zzr zzrVar, long j) {
        zzav zzavVarZzj = zzj();
        String str = zzrVar.zza;
        rq4.n(str);
        zzh zzhVarZzu = zzavVarZzj.zzu(str);
        if (zzhVarZzu != null && zzt().zzB(zzrVar.zzb, zzhVarZzu.zzf())) {
            zzaV().zze().zzb("New GMP App Id passed in. Removing cached database data. appId", zzgu.zzl(zzhVarZzu.zzc()));
            zzav zzavVarZzj2 = zzj();
            String strZzc = zzhVarZzu.zzc();
            zzavVarZzj2.zzaw();
            zzavVarZzj2.zzg();
            rq4.k(strZzc);
            try {
                SQLiteDatabase sQLiteDatabaseZze = zzavVarZzj2.zze();
                String[] strArr = {strZzc};
                int iDelete = sQLiteDatabaseZze.delete("events", "app_id=?", strArr) + sQLiteDatabaseZze.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseZze.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseZze.delete("apps", "app_id=?", strArr) + sQLiteDatabaseZze.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseZze.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseZze.delete("event_filters", "app_id=?", strArr) + sQLiteDatabaseZze.delete("property_filters", "app_id=?", strArr) + sQLiteDatabaseZze.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseZze.delete("consent_settings", "app_id=?", strArr) + sQLiteDatabaseZze.delete("default_event_params", "app_id=?", strArr) + sQLiteDatabaseZze.delete("trigger_uris", "app_id=?", strArr);
                ((uu9) tu9.b.a.get()).getClass();
                zzic zzicVar = zzavVarZzj2.zzu;
                if (zzicVar.zzc().zzp(null, zzfy.zzbh)) {
                    iDelete += sQLiteDatabaseZze.delete("no_data_mode_events", "app_id=?", strArr);
                }
                if (iDelete > 0) {
                    zzicVar.zzaV().zzk().zzc("Deleted application data. app, records", strZzc, Integer.valueOf(iDelete));
                }
            } catch (SQLiteException e) {
                zzavVarZzj2.zzu.zzaV().zzb().zzc("Error deleting application data. appId, error", zzgu.zzl(strZzc), e);
            }
            zzhVarZzu = null;
        }
        if (zzhVarZzu != null) {
            boolean z = (zzhVarZzu.zzt() == -2147483648L || zzhVarZzu.zzt() == zzrVar.zzj) ? false : true;
            String strZzr = zzhVarZzu.zzr();
            if (z || ((zzhVarZzu.zzt() != -2147483648L || strZzr == null || strZzr.equals(zzrVar.zzc)) ? false : true)) {
                Bundle bundle = new Bundle();
                bundle.putString("_pv", strZzr);
                zzbg zzbgVar = new zzbg("_au", new zzbe(bundle), "auto", j);
                if (zzd().zzp(null, zzfy.zzbc)) {
                    zzE(zzbgVar, zzrVar);
                } else {
                    zzF(zzbgVar, zzrVar);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.zzh zzao(com.google.android.gms.measurement.internal.zzr r13) {
        /*
            Method dump skipped, instruction units count: 514
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzpg.zzao(com.google.android.gms.measurement.internal.zzr):com.google.android.gms.measurement.internal.zzh");
    }

    public final String zzap(zzr zzrVar) {
        try {
            return (String) zzaW().zzh(new zzoz(this, zzrVar)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            zzaV().zzb().zzc("Failed to get app instance id. appId", zzgu.zzl(zzrVar.zza), e);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    public final List zzaq(zzr zzrVar, Bundle bundle) {
        zzaW().zzg();
        yv9.a();
        zzal zzalVarZzd = zzd();
        String str = zzrVar.zza;
        if (!zzalVarZzd.zzp(str, zzfy.zzaP) || str == null) {
            return new ArrayList();
        }
        if (bundle != null) {
            int[] intArray = bundle.getIntArray("uriSources");
            long[] longArray = bundle.getLongArray("uriTimestamps");
            if (intArray != null) {
                if (longArray == null || longArray.length != intArray.length) {
                    zzaV().zzb().zza("Uri sources and timestamps do not match");
                } else {
                    for (int i = 0; i < intArray.length; i++) {
                        zzav zzavVarZzj = zzj();
                        int i2 = intArray[i];
                        long j = longArray[i];
                        rq4.k(str);
                        zzavVarZzj.zzg();
                        zzavVarZzj.zzaw();
                        try {
                            int iDelete = zzavVarZzj.zze().delete("trigger_uris", "app_id=? and source=? and timestamp_millis<=?", new String[]{str, String.valueOf(i2), String.valueOf(j)});
                            zzgs zzgsVarZzk = zzavVarZzj.zzu.zzaV().zzk();
                            StringBuilder sb = new StringBuilder(String.valueOf(iDelete).length() + 46);
                            sb.append("Pruned ");
                            sb.append(iDelete);
                            sb.append(" trigger URIs. appId, source, timestamp");
                            zzgsVarZzk.zzd(sb.toString(), str, Integer.valueOf(i2), Long.valueOf(j));
                        } catch (SQLiteException e) {
                            zzavVarZzj.zzu.zzaV().zzb().zzc("Error pruning trigger URIs. appId", zzgu.zzl(str), e);
                        }
                    }
                }
            }
        }
        zzav zzavVarZzj2 = zzj();
        String str2 = zzrVar.zza;
        rq4.k(str2);
        zzavVarZzj2.zzg();
        zzavVarZzj2.zzaw();
        ?? arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = zzavVarZzj2.zze().query("trigger_uris", new String[]{"trigger_uri", "timestamp_millis", "source"}, "app_id=?", new String[]{str2}, null, null, "rowid", null);
                if (cursorQuery.moveToFirst()) {
                    do {
                        String string = cursorQuery.getString(0);
                        if (string == null) {
                            string = "";
                        }
                        arrayList.add(new zzoh(string, cursorQuery.getLong(1), cursorQuery.getInt(2)));
                    } while (cursorQuery.moveToNext());
                }
            } catch (SQLiteException e2) {
                zzavVarZzj2.zzu.zzaV().zzb().zzc("Error querying trigger uris. appId", zzgu.zzl(str2), e2);
                arrayList = Collections.EMPTY_LIST;
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return arrayList;
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    public final void zzar(String str, zzaf zzafVar) {
        zzaW().zzg();
        zzu();
        zzav zzavVarZzj = zzj();
        long j = zzafVar.zza;
        zzpj zzpjVarZzB = zzavVarZzj.zzB(j);
        if (zzpjVarZzB == null) {
            zzaV().zze().zzc("[sgtm] Queued batch doesn't exist. appId, rowId", str, Long.valueOf(j));
            return;
        }
        String strZze = zzpjVarZzB.zze();
        if (zzafVar.zzb != zzlr.SUCCESS.zza()) {
            if (zzafVar.zzb == zzlr.BACKOFF.zza()) {
                Map map = this.zzF;
                zzpe zzpeVar = (zzpe) map.get(strZze);
                if (zzpeVar == null) {
                    zzpeVar = new zzpe(this);
                    map.put(strZze, zzpeVar);
                } else {
                    zzpeVar.zza();
                }
                ((eq) zzaZ()).getClass();
                zzaV().zzk().zzd("[sgtm] Putting sGTM server in backoff mode. appId, destination, nextRetryInSeconds", str, strZze, Long.valueOf((zzpeVar.zzc() - System.currentTimeMillis()) / 1000));
            }
            zzav zzavVarZzj2 = zzj();
            Long lValueOf = Long.valueOf(zzafVar.zza);
            zzavVarZzj2.zzK(lValueOf);
            zzaV().zzk().zzc("[sgtm] increased batch retry count after failed client upload. appId, rowId", str, lValueOf);
            return;
        }
        Map map2 = this.zzF;
        if (map2.containsKey(strZze)) {
            map2.remove(strZze);
        }
        zzav zzavVarZzj3 = zzj();
        Long lValueOf2 = Long.valueOf(j);
        zzavVarZzj3.zzE(lValueOf2);
        zzaV().zzk().zzc("[sgtm] queued batch deleted after successful client upload. appId, rowId", str, lValueOf2);
        long j2 = zzafVar.zzc;
        if (j2 > 0) {
            zzav zzavVarZzj4 = zzj();
            zzavVarZzj4.zzg();
            zzavVarZzj4.zzaw();
            Long lValueOf3 = Long.valueOf(j2);
            ContentValues contentValues = new ContentValues();
            contentValues.put("upload_type", Integer.valueOf(zzls.GOOGLE_SIGNAL.zza()));
            zzic zzicVar = zzavVarZzj4.zzu;
            ((eq) zzicVar.zzaZ()).getClass();
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, Long.valueOf(System.currentTimeMillis()));
            try {
                if (zzavVarZzj4.zze().update("upload_queue", contentValues, "rowid=? AND app_id=? AND upload_type=?", new String[]{String.valueOf(j2), str, String.valueOf(zzls.GOOGLE_SIGNAL_PENDING.zza())}) != 1) {
                    zzicVar.zzaV().zze().zzc("Google Signal pending batch not updated. appId, rowId", str, lValueOf3);
                }
                zzaV().zzk().zzc("[sgtm] queued Google Signal batch updated. appId, signalRowId", str, Long.valueOf(zzafVar.zzc));
                zzP(str);
            } catch (SQLiteException e) {
                zzavVarZzj4.zzu.zzaV().zzb().zzd("Failed to update google Signal pending batch. appid, rowId", str, Long.valueOf(j2), e);
                throw e;
            }
        }
    }

    public final void zzas(boolean z) {
        zzaL();
    }

    public final void zzat(String str, zzlu zzluVar) {
        zzaW().zzg();
        String str2 = this.zzH;
        if (str2 == null || str2.equals(str) || zzluVar != null) {
            this.zzH = str;
            this.zzG = zzluVar;
        }
    }

    public final /* synthetic */ void zzau(zzph zzphVar) {
        zzaW().zzg();
        this.zzm = new zzhk(this);
        zzav zzavVar = new zzav(this);
        zzavVar.zzax();
        this.zze = zzavVar;
        zzht zzhtVar = this.zzc;
        zzal zzalVarZzd = zzd();
        rq4.n(zzhtVar);
        zzalVarZzd.zza(zzhtVar);
        zznn zznnVar = new zznn(this);
        zznnVar.zzax();
        this.zzk = zznnVar;
        zzad zzadVar = new zzad(this);
        zzadVar.zzax();
        this.zzh = zzadVar;
        zzlp zzlpVar = new zzlp(this);
        zzlpVar.zzax();
        this.zzj = zzlpVar;
        zzok zzokVar = new zzok(this);
        zzokVar.zzax();
        this.zzg = zzokVar;
        this.zzf = new zzhb(this);
        if (this.zzs != this.zzt) {
            zzaV().zzb().zzc("Not all upload components initialized", Integer.valueOf(this.zzs), Integer.valueOf(this.zzt));
        }
        this.zzo.set(true);
        zzaV().zzk().zza("UploadController is now fully initialized");
    }

    public final /* synthetic */ zzic zzax() {
        return this.zzn;
    }

    public final /* synthetic */ Deque zzay() {
        return this.zzr;
    }

    public final /* synthetic */ void zzaz(long j) {
        this.zzJ = j;
    }

    public final void zzc() {
        zzaW().zzg();
        zzj().zzI();
        zzav zzavVarZzj = zzj();
        zzavVarZzj.zzg();
        zzavVarZzj.zzaw();
        if (zzavVarZzj.zzag()) {
            zzfx zzfxVar = zzfy.zzav;
            if (((Long) zzfxVar.zzb(null)).longValue() != 0) {
                SQLiteDatabase sQLiteDatabaseZze = zzavVarZzj.zze();
                zzic zzicVar = zzavVarZzj.zzu;
                ((eq) zzicVar.zzaZ()).getClass();
                int iDelete = sQLiteDatabaseZze.delete("trigger_uris", "abs(timestamp_millis - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(zzfxVar.zzb(null))});
                if (iDelete > 0) {
                    zzicVar.zzaV().zzk().zzb("Deleted stale trigger uris. rowsDeleted", Integer.valueOf(iDelete));
                }
            }
        }
        if (this.zzk.zzd.zza() == 0) {
            zzhe zzheVar = this.zzk.zzd;
            ((eq) zzaZ()).getClass();
            zzheVar.zzb(System.currentTimeMillis());
        }
        zzaL();
    }

    public final zzal zzd() {
        zzic zzicVar = this.zzn;
        rq4.n(zzicVar);
        return zzicVar.zzc();
    }

    public final zzou zzf() {
        return this.zzl;
    }

    public final zzht zzh() {
        zzht zzhtVar = this.zzc;
        zzaS(zzhtVar);
        return zzhtVar;
    }

    public final zzgz zzi() {
        zzgz zzgzVar = this.zzd;
        zzaS(zzgzVar);
        return zzgzVar;
    }

    public final zzav zzj() {
        zzav zzavVar = this.zze;
        zzaS(zzavVar);
        return zzavVar;
    }

    public final zzhb zzk() {
        zzhb zzhbVar = this.zzf;
        if (zzhbVar != null) {
            return zzhbVar;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    public final zzok zzl() {
        zzok zzokVar = this.zzg;
        zzaS(zzokVar);
        return zzokVar;
    }

    public final zzad zzm() {
        zzad zzadVar = this.zzh;
        zzaS(zzadVar);
        return zzadVar;
    }

    public final zzlp zzn() {
        zzlp zzlpVar = this.zzj;
        zzaS(zzlpVar);
        return zzlpVar;
    }

    public final zzpk zzp() {
        zzpk zzpkVar = this.zzi;
        zzaS(zzpkVar);
        return zzpkVar;
    }

    public final zznn zzq() {
        return this.zzk;
    }

    public final zzgn zzs() {
        return this.zzn.zzl();
    }

    public final zzpp zzt() {
        zzic zzicVar = this.zzn;
        rq4.n(zzicVar);
        return zzicVar.zzk();
    }

    public final void zzu() {
        if (!this.zzo.get()) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    public final void zzv(zzr zzrVar) {
        zzaW().zzg();
        zzu();
        String str = zzrVar.zza;
        rq4.k(str);
        zzjl zzjlVarZzf = zzjl.zzf(zzrVar.zzs, zzrVar.zzx);
        zzB(str);
        zzaV().zzk().zzc("Setting storage consent for package", str, zzjlVarZzf);
        zzA(str, zzjlVarZzf);
    }

    public final void zzw(zzr zzrVar) {
        zzaW().zzg();
        zzu();
        String str = zzrVar.zza;
        rq4.k(str);
        zzaz zzazVarZzg = zzaz.zzg(zzrVar.zzy);
        zzaV().zzk().zzc("Setting DMA consent for package", str, zzazVarZzg);
        zzaW().zzg();
        zzu();
        zzji zzjiVarZzc = zzaz.zzh(zzy(str), 100).zzc();
        this.zzD.put(str, zzazVarZzg);
        zzj().zzab(str, zzazVarZzg);
        zzji zzjiVarZzc2 = zzaz.zzh(zzy(str), 100).zzc();
        zzaW().zzg();
        zzu();
        zzji zzjiVar = zzji.DENIED;
        boolean z = zzjiVarZzc == zzjiVar && zzjiVarZzc2 == zzji.GRANTED;
        boolean z2 = zzjiVarZzc == zzji.GRANTED && zzjiVarZzc2 == zzjiVar;
        if (z || z2) {
            zzaV().zzk().zzb("Generated _dcu event for", str);
            Bundle bundle = new Bundle();
            if (zzj().zzw(zzC(), str, false, false, false, false, false, false, false).zzf < zzd().zzm(str, zzfy.zzam)) {
                bundle.putLong("_r", 1L);
                zzaV().zzk().zzc("_dcu realtime event count", str, Long.valueOf(zzj().zzw(zzC(), str, false, false, false, false, false, true, false).zzf));
            }
            this.zzK.zza(str, "_dcu", bundle);
        }
    }

    public final zzaz zzx(String str) {
        zzaW().zzg();
        zzu();
        Map map = this.zzD;
        zzaz zzazVar = (zzaz) map.get(str);
        if (zzazVar != null) {
            return zzazVar;
        }
        zzaz zzazVarZzaa = zzj().zzaa(str);
        map.put(str, zzazVarZzaa);
        return zzazVarZzaa;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final Bundle zzy(String str) {
        zzaW().zzg();
        zzu();
        if (zzh().zzx(str) == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        zzjl zzjlVarZzB = zzB(str);
        bundle.putAll(zzjlVarZzB.zzn());
        bundle.putAll(zzz(str, zzx(str), zzjlVarZzB, new zzan()).zzf());
        zzpn zzpnVarZzm = zzj().zzm(str, "_npa");
        bundle.putString("ad_personalization", 1 != (zzpnVarZzm != null ? zzpnVarZzm.zze.equals(1L) : zzaC(str, new zzan())) ? "granted" : "denied");
        return bundle;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.zzaz zzz(java.lang.String r10, com.google.android.gms.measurement.internal.zzaz r11, com.google.android.gms.measurement.internal.zzjl r12, com.google.android.gms.measurement.internal.zzan r13) {
        /*
            r9 = this;
            com.google.android.gms.measurement.internal.zzht r0 = r9.zzh()
            com.google.android.gms.internal.measurement.j r0 = r0.zzx(r10)
            java.lang.String r1 = "-"
            r2 = 90
            if (r0 != 0) goto L31
            com.google.android.gms.measurement.internal.zzji r10 = r11.zzc()
            com.google.android.gms.measurement.internal.zzji r12 = com.google.android.gms.measurement.internal.zzji.DENIED
            if (r10 != r12) goto L20
            int r2 = r11.zzb()
            com.google.android.gms.measurement.internal.zzjk r10 = com.google.android.gms.measurement.internal.zzjk.AD_USER_DATA
            r13.zzb(r10, r2)
            goto L27
        L20:
            com.google.android.gms.measurement.internal.zzjk r10 = com.google.android.gms.measurement.internal.zzjk.AD_USER_DATA
            com.google.android.gms.measurement.internal.zzam r11 = com.google.android.gms.measurement.internal.zzam.FAILSAFE
            r13.zzc(r10, r11)
        L27:
            com.google.android.gms.measurement.internal.zzaz r10 = new com.google.android.gms.measurement.internal.zzaz
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            r10.<init>(r11, r2, r12, r1)
            return r10
        L31:
            com.google.android.gms.measurement.internal.zzji r0 = r11.zzc()
            com.google.android.gms.measurement.internal.zzji r3 = com.google.android.gms.measurement.internal.zzji.GRANTED
            if (r0 == r3) goto L85
            com.google.android.gms.measurement.internal.zzji r4 = com.google.android.gms.measurement.internal.zzji.DENIED
            if (r0 != r4) goto L3e
            goto L85
        L3e:
            com.google.android.gms.measurement.internal.zzji r11 = com.google.android.gms.measurement.internal.zzji.POLICY
            if (r0 != r11) goto L55
            com.google.android.gms.measurement.internal.zzht r11 = r9.zzc
            com.google.android.gms.measurement.internal.zzjk r0 = com.google.android.gms.measurement.internal.zzjk.AD_USER_DATA
            com.google.android.gms.measurement.internal.zzji r11 = r11.zzA(r10, r0)
            com.google.android.gms.measurement.internal.zzji r5 = com.google.android.gms.measurement.internal.zzji.UNINITIALIZED
            if (r11 == r5) goto L55
            com.google.android.gms.measurement.internal.zzam r12 = com.google.android.gms.measurement.internal.zzam.REMOTE_ENFORCED_DEFAULT
            r13.zzc(r0, r12)
            r0 = r11
            goto L8e
        L55:
            com.google.android.gms.measurement.internal.zzht r11 = r9.zzc
            com.google.android.gms.measurement.internal.zzjk r0 = com.google.android.gms.measurement.internal.zzjk.AD_USER_DATA
            com.google.android.gms.measurement.internal.zzjk r5 = r11.zzw(r10, r0)
            com.google.android.gms.measurement.internal.zzji r12 = r12.zzp()
            r6 = 1
            if (r12 == r3) goto L66
            if (r12 != r4) goto L68
        L66:
            r7 = r6
            goto L69
        L68:
            r7 = 0
        L69:
            com.google.android.gms.measurement.internal.zzjk r8 = com.google.android.gms.measurement.internal.zzjk.AD_STORAGE
            if (r5 != r8) goto L76
            if (r7 == 0) goto L76
            com.google.android.gms.measurement.internal.zzam r11 = com.google.android.gms.measurement.internal.zzam.REMOTE_DELEGATION
            r13.zzc(r0, r11)
            r0 = r12
            goto L8e
        L76:
            com.google.android.gms.measurement.internal.zzam r12 = com.google.android.gms.measurement.internal.zzam.REMOTE_DEFAULT
            r13.zzc(r0, r12)
            boolean r11 = r11.zzv(r10, r0)
            if (r6 == r11) goto L83
            r0 = r4
            goto L8e
        L83:
            r0 = r3
            goto L8e
        L85:
            int r2 = r11.zzb()
            com.google.android.gms.measurement.internal.zzjk r11 = com.google.android.gms.measurement.internal.zzjk.AD_USER_DATA
            r13.zzb(r11, r2)
        L8e:
            com.google.android.gms.measurement.internal.zzht r11 = r9.zzc
            boolean r11 = r11.zzy(r10)
            com.google.android.gms.measurement.internal.zzht r12 = r9.zzh()
            java.util.SortedSet r10 = r12.zzz(r10)
            com.google.android.gms.measurement.internal.zzji r12 = com.google.android.gms.measurement.internal.zzji.DENIED
            if (r0 == r12) goto Lbb
            boolean r12 = r10.isEmpty()
            if (r12 == 0) goto La7
            goto Lbb
        La7:
            com.google.android.gms.measurement.internal.zzaz r12 = new com.google.android.gms.measurement.internal.zzaz
            java.lang.Boolean r13 = java.lang.Boolean.TRUE
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r11)
            java.lang.String r1 = ""
            if (r11 == 0) goto Lb7
            java.lang.String r1 = android.text.TextUtils.join(r1, r10)
        Lb7:
            r12.<init>(r13, r2, r0, r1)
            return r12
        Lbb:
            com.google.android.gms.measurement.internal.zzaz r10 = new com.google.android.gms.measurement.internal.zzaz
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            r10.<init>(r12, r2, r11, r1)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzpg.zzz(java.lang.String, com.google.android.gms.measurement.internal.zzaz, com.google.android.gms.measurement.internal.zzjl, com.google.android.gms.measurement.internal.zzan):com.google.android.gms.measurement.internal.zzaz");
    }
}
