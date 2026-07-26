package ir.mservices.market.social.level.data;

import defpackage.js3;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class LevelPageDto {
    private final List<LevelInfoDto> achievements;
    private final LevelDetailDto levelDetail;

    public LevelPageDto(LevelDetailDto levelDetailDto, List<LevelInfoDto> list) {
        js3.p(levelDetailDto, "levelDetail");
        js3.p(list, "achievements");
        this.levelDetail = levelDetailDto;
        this.achievements = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LevelPageDto copy$default(LevelPageDto levelPageDto, LevelDetailDto levelDetailDto, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            levelDetailDto = levelPageDto.levelDetail;
        }
        if ((i & 2) != 0) {
            list = levelPageDto.achievements;
        }
        return levelPageDto.copy(levelDetailDto, list);
    }

    public final LevelDetailDto component1() {
        return this.levelDetail;
    }

    public final List<LevelInfoDto> component2() {
        return this.achievements;
    }

    public final LevelPageDto copy(LevelDetailDto levelDetailDto, List<LevelInfoDto> list) {
        js3.p(levelDetailDto, "levelDetail");
        js3.p(list, "achievements");
        return new LevelPageDto(levelDetailDto, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LevelPageDto)) {
            return false;
        }
        LevelPageDto levelPageDto = (LevelPageDto) obj;
        return js3.i(this.levelDetail, levelPageDto.levelDetail) && js3.i(this.achievements, levelPageDto.achievements);
    }

    public final List<LevelInfoDto> getAchievements() {
        return this.achievements;
    }

    public final LevelDetailDto getLevelDetail() {
        return this.levelDetail;
    }

    public int hashCode() {
        return this.achievements.hashCode() + (this.levelDetail.hashCode() * 31);
    }

    public String toString() {
        return "LevelPageDto(levelDetail=" + this.levelDetail + ", achievements=" + this.achievements + ")";
    }
}
