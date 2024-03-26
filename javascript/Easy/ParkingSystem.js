/**
 * @param {number} big
 * @param {number} medium
 * @param {number} small
 */

var ParkingSystem = function(big, medium, small) {
    this.p = [0, big, medium, small];
}

/**
 * @param {number} carType
 * @return {boolean}
 */
ParkingSystem.prototype.addCar = function(carType) {
    return this.p[carType]-- > 0
}