package it.achtelik.worldoflife.world.entrypoints.model;

public class WorldCellDto {
    private final WorldPositionDto worldPositionDto;

    public WorldCellDto(WorldPositionDto worldPositionDto) {
        this.worldPositionDto = worldPositionDto;
    }

    public WorldPositionDto getWorldPositionDto() {
        return worldPositionDto;
    }
}