package net.lliira.game.campaign.common.model.dnd;

public enum Size {
  Tiny(2.5F),
  Small(5),
  Medium(5),
  Large(10),
  Huge(15),
  Gargantaun(20);

  private final float spaceInFeet;

  Size(float spaceInFeet) {
    this.spaceInFeet = spaceInFeet;
  }

  public float getSpaceInFeet() {
    return spaceInFeet;
  }
}
