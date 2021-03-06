package it.achtelik.worldoflife.usecases.world.entrypoints.model;

import com.fasterxml.jackson.annotation.JsonCreator;

import java.util.Objects;

public class WorldPositionDto {
    private final Integer x;
    private final Integer y;

    @JsonCreator
    public WorldPositionDto(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public Integer getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WorldPositionDto that = (WorldPositionDto) o;
        return x.equals(that.x) &&
                y.equals(that.y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
