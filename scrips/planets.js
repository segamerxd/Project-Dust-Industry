const planetGen = require("projectindustry/libs/planetGen");

const caeruleum = extend(Planet, "zertack", Planets.sun, 4, 1.30, {
  generator: planetGen.planetGen,
  bloom: true,
  accessible: true,
  hasAtmosphere: true,
  atmosphereColor: Color.valueOf("363f9a"),
  atmosphereRadIn: 0.02,
  atmosphereRadOut: 0.3,
  localizedName: "Zertack",
  startSector: 10
});
caeruleum.meshLoader = () => extend(HexMesh, zertack, 6, {});
