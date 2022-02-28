const astral = extend(Item, "astral", {});
const acid_ash = extend(Item, "acid ash", {});

const citem = stringName => Vars.content.getByName(ContentType.item, "projectindustry-" + stringName);

module.exports = {
	astral: citem("astral"),
	acid_ash: citem("acid ash")
};
